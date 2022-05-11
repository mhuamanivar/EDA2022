public class Ejemplo_recursion
{
	public static void main(String args[]) {
		int num = 9;
		System.out.println("El numero es: "+num);
		System.out.println("Su factorial es: "+factorial(num));
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n-1); 
		}
	}
}
