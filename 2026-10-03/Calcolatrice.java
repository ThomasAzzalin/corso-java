/*
"Calcolatrice 1.0" (come visto a lezione): 
chiedere all'utente di inserire due numeri; 
calcolare e stampare in output la somma, la differenza, il prodotto, il modulo e la divisione
utilizzando i due numeri come operandi. Si raccomanda di gestire il caso di divisione per zero.
*/

import java.util.Scanner;

public class Calcolatrice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserisci il primo numero: ");
		int a = sc.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		int b = sc.nextInt();
		sc.close();

		System.out.printf("La somma tra %d e %d: %d%n", a, b, a+b);

		System.out.printf("La differenza tra %d e %d: %d%n", a, b, a-b);

		System.out.printf("Il prodotto tra %d e %d: %d%n", a, b, a*b);

		if(b == 0){
			System.out.println("Divisione e modulo per 0 impossibile!");
		} else {
			System.out.printf("La divisione fra %d e %d e' uguale a: %.2f%n", a, b, (double) a/b);
			System.out.printf("Il modulo fra %d e %d e' uguale a: %d%n", a, b, a%b);
		}
	}
}
