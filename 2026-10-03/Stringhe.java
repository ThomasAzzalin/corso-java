/*
Chiedere all'utente di inserire due stringhe e stampare in output quale delle due risulta più lunga; 
se le stringhe hanno la stessa lunghezza, avvisare l'utente che le stringhe contengono lo stesso numero di caratteri.
*/

import java.util.Scanner;

public class Stringhe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserisci la prima stringa: ");
		String a = sc.nextLine();
		System.out.print("Inserisci la seconda stringa: ");
		String b = sc.nextLine();
		sc.close();

		int aLen = a.length();
		int bLen = b.length();

		if(aLen == bLen) {
			System.out.printf("Le stringhe hanno la stessa lunghezza di %d caratteri %n", aLen);
			return;
		}

		if(aLen > bLen) {
			System.out.printf("la prima stringa:%n%s%ncontiene %d caratteri ed e' piu' lunga di %d caratteri rispetto alla seconda%n", a, aLen, aLen-bLen);
		} else {
			System.out.printf("la seconda stringa:%n%s%ncontiene %d caratteri ed e' piu' lunga di %d caratteri rispetto alla prima%n", b, bLen, bLen-aLen);
		}
	}
}
