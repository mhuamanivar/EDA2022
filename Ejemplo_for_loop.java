public class Ejemplo_for_loop
{
	public static void main(String args[]) {
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
	}
}
