public class Ejemplo_method_parameters
{
	public static void main(String args[]) {

		String operacion = "+";
		int n1 = 36, n2 = 10;
		
		System.out.println("Numero 1: "+n1);
		System.out.println("Numero 2: "+n2+"\n");

	}

	public static double calcular(String o, int a, int b) {
		switch(o) {
			case "+":
				return a + b;
				break;
			case "-":
				return a - b;
				break;
			case "*":
				return a * b;
				break;
			case "/":
				return a / b;
				break;
		}
	}
}
