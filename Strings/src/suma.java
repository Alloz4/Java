
public class suma {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Error de parámetros");
			System.exit(0);
		}
		
		int num1 = Integer.valueOf(args[0]);
		int num2 = Integer.valueOf(args[1]);
		
		System.out.println(num1 + num2);
	}

}
