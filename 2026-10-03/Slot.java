/*
chiedere all'utente di inserire un numero compreso tra 1 (incluso) e 100 (non incluso):
calcolare un numero pseudo-casuale compreso tra 0 e il doppio del valore precedentemente inserito dall'utente; 
se il numero pseudo-casuale ottenuto è maggiore del numero inserito inizialmente, l'utente ha vinto, 
altrimenti ha perso (stampare, quindi, degli opportuni messaggi di risposta).
*/

import java.util.Random;
import java.util.Scanner;

public class Slot{
	public static void main(String[] args) {
		// oggetto per generazione numero casuale
		Random rnd = new Random();
		// creo oggetto per richiedere input da utente
		Scanner sc = new Scanner(System.in);

		System.out.print("Per favore, inserisci un numero fra 1 e 99: ");
		int userNum = sc.nextInt();
		sc.close();

		// controllo se input utente rientra nel range richiesto
		if(!checkInput(userNum)) {
			System.out.println("numero fuori dall'intervallo [1, 99]");
			return;
			}

		int randomNum = rnd.nextInt(userNum*2 + 1);
		if (randomNum > userNum){
			System.out.printf("Hai vinto!, il valore generato e' stato: %d%n", randomNum);

		} else {
			System.out.printf("Hai perso, hai inserito %d, mentre  il valore generato e' stato: %d%n", userNum, randomNum);
		}


	}

	private static boolean checkInput(int a) {
		if(a >= 100 || a < 1) return false;
		return true;
	}
}

