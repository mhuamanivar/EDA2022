public class Ejemplo_for_loop
{
	public static void main(String args[]) {
		System.out.println("USANDO FOR");
		System.out.println("Numeros pares del 1 al 10");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i+"  ");
			}
		}
				
		System.out.println("\nNumeros impares del 1 al 10");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i+"  ");
			}
		}

		int[] numeros = {1, 10, 2, 5};
		System.out.println("\nUSANDO FOR EACH");
		for(int n:numeros) {
			System.out.print(n+"  ");
		}
		System.out.println();
	}
}
