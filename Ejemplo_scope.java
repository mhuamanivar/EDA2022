public class Ejemplo_scope
{
	public static void main(String args[]) {
		
		//Dara error porque la variable a no esta definida 
		System.out.println("Valor de a: "+a);

		//Esto si se ejecutaria si es que estuviera anteriormente
		String a = "Adios";
		System.out.println("Valor de a: "+a);
	}
}
