/*
Realizzare l'applicazione "Slot 2.0".
In grado di assegnare una vincita diversa in base al numero scelto dall'utente, in rapporto al numero casuale generato dal programma. 
In particolare:
l'utente vince un gettone se il numero pseudo-casuale ottenuto è maggiore del numero inserito inizialmente
l'utente vince cinque gettoni se sia il numero pseudo-casuale ottenuto sia il numero inserito inizialmente sono pari
l'utente vince dieci gettoni se è vera la condizione 1 e se il numero pseudo-casuale ottenuto è divisibile per il numero inserito inizialmente

Stampare all'utente quanti gettoni ha vinto (se non ha vinto, i gettoni saranno zero).

Si raccomanda l'utilizzo dell'operazione modulo!
*/

import java.util.Scanner;
import java.util.Random;

public class Slot2{
	public static void main(String[] args){		
		int gettoni = 0;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.print("Inserisci un numero compreso in questo range [1, 99]: ");
		int num = sc.nextInt();
		sc.close();
		if(!checkNum(num)){
			System.out.println("Il numero inserito e' esterno dal range richiesto!");
			return;
		}

		int rndNum = rnd.nextInt(num*2 + 1);
		if(rndNum > num) { 
			gettoni++;
			if(rndNum % num == 0) gettoni += 10;
			}

		if(isPari(num) && isPari(rndNum)) gettoni += 5;
		
		System.out.println("Il numero generato casualmente e': " + rndNum);
		System.out.printf("Il giocatore ha %d gettoni!%n", gettoni);
	}

	private static boolean checkNum(int n){
		if(n > 99 || n < 1) return false;
		return true;
	}

	private static boolean isPari(int n){
		if(n % 2 == 0) return true;
		return false;
	}
}
