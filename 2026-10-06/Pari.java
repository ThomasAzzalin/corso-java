import java.util.Scanner;

public class Pari{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero per sapere se esso e' pari o dispari: ");
		int n = sc.nextInt();
		sc.close();	

		if(n%2 == 0){
			System.out.println("Il numero " + n + " e' pari!");
		} else {
			System.out.println("Il numero " + n + " e' dispari");
		}
	}
}
