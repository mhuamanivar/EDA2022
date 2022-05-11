public class Ejemplo_arrays
{
	public static void main(String args[]) {

		String[] personas = {"Maria", "Edith", "Melsy"};
		
		System.out.println("ARREGLO SIMPLE");
		System.out.println("En la posicion 1: "+personas[0]);
		System.out.println("En la posicion 2: "+personas[1]);
		System.out.println("En la posicion 3: "+personas[2]+"\n");

		System.out.println("ARREGLO BIDIMENSIONAL");
		int[][] matriz = {{1, 3, 5},{7, 2, 0},{4, 6, 8}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
