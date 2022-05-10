
public class ejemplo_Method_Parameters {

	//metodo sin retorno
	public static void saludo (String nombre) {
	 System.out.println("Bienvendo: "+ nombre);
	}
	
	//metodo con retorno
	public static int suma( int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		
		saludo("Lucero");
		System.out.println("Metodo de suma: "+suma(10,5));
		
	}

}
