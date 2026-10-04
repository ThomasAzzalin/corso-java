import java.util.Scanner;

public class votiPonderati{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int cfu = 0;
	int voti = 0;
	
	System.out.print("Scrivi il numero di voti che andrai ad inserire: ");
	int numeroVoti = sc.nextInt();
	
	for(int i = 0; i<numeroVoti; i++){
		System.out.print("Inserisci il voto: ");
		int voto = sc.nextInt();
		System.out.print("Inserisci il peso in cfu del voto: ");
		int peso = sc.nextInt();
		
		cfu += peso;
		voti += voto * peso;
		}
	if(numeroVoti > 0) {
		double mediaPonderata = (double) voti/cfu;
		System.out.printf("La media ponderata e': %.2f",  mediaPonderata);
	} else {
		System.out.print("Non e' stato inserito nessun voto!");
		}
	}
}
