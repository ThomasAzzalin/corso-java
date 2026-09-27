public class Main{
	public static void main(String[] args){
		// conversione primo argomento: string -> array di char
		char[] bin_number;
		try{
			bin_number = args[0].toCharArray();
		} catch (Exception e){
			System.out.println("Devi eseguire il comando nel seguente modo: java Main x. dove x e' il numero binario da convertire");
			return;
		}
		// controllo che l'argomento abbia un formato appropriato
		if(!checkArgs(bin_number)) {return;}

		// effettuo la conversione effettiva, cifra per cifra
		int result = 0;
		int index = 0;
		for(int i = bin_number.length-1; i >= 0; i--) {
			result += convertDigit(bin_number[i] - '0', index);
			index++;
		}
		System.out.println(result);
	}

	// sviluppo posizionale
	public static int convertDigit(int value, int index){
		return value * power(2, index); 
	}

	// metodo di supporto per calcolare le potenze
	public static int power(int base, int exp){
		int res = base;
		
		if(exp == 0){return 1;}

		while(exp>1){
			res *= base;
			exp--;
		}
		return res;
	}

	// metodo per controllare la conformita dell'argomento inserito dall'utente
	public static boolean checkArgs(char[] bin_number) {
		for(int i = 0; i < bin_number.length; i++){
			try{
				int a = Integer.parseInt(String.valueOf(bin_number[i]));
				if(a>1){
				System.out.println("La cifra da convertire dovrebbe contenere solo 1 e 0");
				return false;
				}
			}
			catch(Exception e){
				System.out.println("C'e' stato un errore nell' argomento che hai scritto nell'esecuzione del programma");
				return false;
			}
		}
		return true;
	}
}
