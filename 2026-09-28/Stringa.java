import java.util.Scanner;

public class Stringa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// metodo possibile ma mai utilizzato
		//String str = new String("test dela Stringa");
		String str = "test della stringa";
		str = str.toUpperCase();
		System.out.println("Stringa tutta maiuscola: " + str);
		System.out.println("Lunghezza stringa: " + str.length());
		
		System.out.print("Inserisci una stringa: ");
		str = sc.nextLine();
		System.out.print("Inserisci il begin: ");
		int a = sc.nextInt();
		System.out.print("Inserisci l'end: ");
		int b = sc.nextInt();
		System.out.println(str.substring(a, b));	
	}
}
