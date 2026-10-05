/*
Chiedere all'utente di inserire una stringa e un intero, stampare in output se la stringa è:
lunga come, 
piu' corta dell'intero,
se è più lunga, stampare le due sotto-stringhe usando come pivot l'intero. 
Il programma non accetta interi negativi e/o stringhe vuote.
*/

import java.util.Scanner;

public class StringaNumero{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci una stringa, non vuota: ");
		String str = sc.nextLine();
		if(!checkString(str)){
			System.out.println("Hai inserito una stringa vuota!");
			sc.close();
			return;
		}
		System.out.print("Inserisci un numero positivo: ");
		int num = sc.nextInt();
		if(!checkNum(num)){
			System.out.println("Hai inserito un numero negativo!");
			sc.close();
			return;
		}
		sc.close();

		int lenStr = str.length();

		if(lenStr == num){
			System.out.println("La lunghezza della stringa combacia con il numero inserito");
		} else if(lenStr < num ){
			System.out.println("La lunghezza della stringa e' inferiore rispetto al numero inserito");
		} else {
			String sub1 = str.substring(0, num);
			String sub2 = str.substring(num);
			System.out.println("La lunghezza della stringa e' maggiore rispetto al numero inserito: ");
			System.out.printf("Prima sub string: %s%nSeconda sub string: %s%nParola completa: %s ", sub1, sub2, str);
			}
	}

	private static boolean checkString(String s){
		if(s.trim() == "") return false;
		return true;
	}

	private static boolean checkNum(int n) {
		if(n < 0) return false;
		return true;
	}
}
