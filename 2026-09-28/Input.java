import java.util.Scanner; 

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		try{
		
			System.out.print("Inserisci il primo numero: ");
			a = sc.nextInt();
			System.out.print("Inserisci il secondo numero: ");
			b = sc.nextInt();
		} catch(Exception e){
			System.out.println("Puoi inserire solo un numero!");
			return;
		}
		System.out.println("a = " + a + ", b = " + b);

	}
}
