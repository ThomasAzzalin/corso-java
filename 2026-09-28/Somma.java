import java.util.Scanner;

public class Somma{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserisci il primo numero: ");
		int a = sc.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		int b = sc.nextInt();

		System.out.println("La somma dei due numero e': " + (a + b));
	}
}
