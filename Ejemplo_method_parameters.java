public class Ejemplo_method_parameters
{
	public static void main(String args[]) {

		String operacion = "+";
		int n1 = 36, n2 = 10;
		
		System.out.println("Numero 1: "+n1);
		System.out.println("Numero 2: "+n2);

		System.out.println("\nLa suma es: "+calcular("+",n1,n2));
		System.out.println("La diferencia es: "+calcular("-",n1,n2));
		System.out.println("El producto es: "+calcular("*",n1,n2));
		System.out.println("El cociente es: "+calcular("/",n1,n2));
	}

	public static double calcular(String o, int a, int b) {
		switch(o) {
			case "+":
				return a + b;
			case "-":
				return a - b;
			case "*":
				return a * b;
			case "/":
				return a * 1.0 / b;
		}
		return 0;
	}
}
