public class Ejemplo_switch
{
	public static void main(String args[]) {

		String operacion = "+";
		int n1 = 5, n2 = 7;

		switch(operacion) {
			case "+":
				System.out.println("La suma es: "+(n1+n2));
				break;
			case "-":
				System.out.println("La diferencia es: "+(n1-n2));
				break;
			case "*":
				System.out.println("El producto es:"+(n1*n2));
				break;
			case "/":
				System.out.println("El cociente es:"+(n1/n2));
				break;
		}
	}
}
