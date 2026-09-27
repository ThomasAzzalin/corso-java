public class HelloWorld{
	public static void main(String[] args){
		if (args.length != 2){
			System.out.println("inserisci due parametri");
			return;
		}
		String str = "la somma e' uguale a: ";
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println(str+c);
	}
}
