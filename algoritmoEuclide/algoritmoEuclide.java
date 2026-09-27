public class algoritmoEuclide{
	static public void main(String[] args){
	if (args.length < 2){
		System.out.println("Utilizzo: java nomeProgramma <x> <y>");
		return;
	}
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int r = x % y;
	while (r != 0){
		x = y;
		y = r;
		r = x % y;
	}

	System.out.println("Il MCD e': " + y);
	}
}
