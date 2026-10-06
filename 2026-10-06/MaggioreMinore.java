/*
Implementare un'applicazione che riceve in input:
1) un valore intero 
2) una sequenza di numeri forniti dall'utente (0 per terminare)
calcolare e stampare in output quanti sono i valori della sequenza maggiori del numero iniziale fornito dall'utente 
(valutare l'utilizzo del break e come farne a meno).
*/

import java.util.Scanner;

public class MaggioreMinore{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un valore intero: ");
		int initialNum = sc.nextInt();
		int count = 0;
		int nextNum;
		
		System.out.println("Inserisci una sequenza di numeri, separa ogni numero con un invio, quando hai finito digira 0 (zero)");
		do {
			nextNum = sc.nextInt();
			if (nextNum > initialNum) count++;
		} while (nextNum != 0);

		System.out.println("Ci sono stati: " + count + " valori piu' grandi di " + initialNum);
	}
}
