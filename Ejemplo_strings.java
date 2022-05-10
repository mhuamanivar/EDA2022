public class Ejemplo_strings
{
	public static void main(String args[]) {
		        
		String curso = "Estructura de Datos y Algoritmos";

		System.out.println("La cadena es:\t '"+curso+"'");
		System.out.println("Tamaño:\t\t "+curso.length());
		System.out.println("En mayuscula:\t "+curso.toUpperCase());
		System.out.println("En minuscula:\t "+curso.toLowerCase());
		System.out.println("Posicion de 'y': "+curso.indexOf("y"));

		String nombre = "Melsy Melany", apell = "Huamani Vargas";
		System.out.println("\nNombre completo: "+nombre+" "+apell);

		int num1 = 10, num2 = 8;
		System.out.println("\nNumero 1: "+num1+"\nNumero 2: "+num2);
		System.out.println("Suma incorrecta de datos: "+num1+num2);
		System.out.println("Suma correcta de datos: "+(num1+num2));
	}
}
