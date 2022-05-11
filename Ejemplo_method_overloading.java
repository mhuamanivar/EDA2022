public class Ejemplo_method_overloading
{
	public static void main(String args[]) {

		saludar();
		saludar("Maria");
		saludar("Melany");
		saludar("Juan",8);
	}

	public static void saludar() {
		System.out.println("¡Hola mundo!");
	}
	public static void saludar(String nombre) {
		System.out.println("¡Hola "+nombre+"!");
	}
	public static void saludar(String nombre, int edad) {
		System.out.println("¡Hola "+nombre+"! Que gusto saber que tienes "+edad+" años de edad.");
	}
}
