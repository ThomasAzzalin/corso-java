import prog.utili.Frazione;
import java.util.Scanner;

public class FrazioneEsempio{
	public static void main(String[] args) {
		int num1, num2, den1, den2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il primo numeratore: ");
		num1 = sc.nextInt();
		System.out.print("Inserisci il secondo numeratore: ");
		num2 = sc.nextInt();
		System.out.print("Inserisci il primo denominatore: ");
		den1 = sc.nextInt();
		System.out.print("Inserisci il secondo denominatore: ");
		den2 = sc.nextInt();
		Frazione f1 = new Frazione(num1, den1);
		Frazione f2 = new Frazione(num2, den2);

		System.out.println(f1);
		System.out.println(f2);

		Frazione res = f1.piu(f2);
		System.out.println(res);
	}
}
