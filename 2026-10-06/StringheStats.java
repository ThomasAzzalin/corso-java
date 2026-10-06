/*
Implementare un'applicazione che riceve in input una sequenza di stringhe fornite dall'utente (stringa vuota per terminare)
calcolare e stampare in output: 
- la stringa di lunghezza maggiore
- la stringa di lunghezza minore; 
- mostrare la media delle lunghezze delle stringhe inserite.
*/

import java.util.Scanner;

public class StringheStats{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		String longhest = "";
		String shortest = "";
		float mean = 0;
		int count = -1;

		System.out.println("Inserisci quante stringhe vuoi, divise da un invio, quando hai finito lascia la stringa vuota e premi invio!");
		do {
			count++;
			str = sc.nextLine();
			mean += str.length();
			if(str.length() > longhest.length())
				longhest = str;

			if(shortest.length() == 0){
				shortest = str;
			} else if(str.length() < shortest.length() && str.length() > 0)
				shortest = str;

		} while (!str.isEmpty());
		if (count != 0) mean /= count;

		System.out.println("Hai inserito " + count + " stringhe");
		System.out.println("La stringa piu' lunga e' stata " + longhest + ". Con ben " + longhest.length() + " caratteri");
		System.out.println("La stringa piu' corta e' stata " + shortest + ". Con ben " + shortest.length() + " caratteri");
		System.out.println("La lunghezza media delle stringhe e' stata di: " + mean + " caratteri");

	}
}
