public class Ejemplo_type_casting
{
	public static void main(String args[]) {
		        
		//Casting automatico
		short sh = 1;
		System.out.println("Numero de tipo short: "+sh);
		int ent = sh;
		System.out.println("Numero de short a int: "+ent);
		double doub = ent;
		System.out.println("Numero de int a double: "+doub+"\n");

		//Casting manual
		double doub2 = 4.5;
		System.out.println("Numero de tipo double: "+doub2);
		int ent2 = (int)(doub2);
		System.out.println("Numero de double a int: "+ent2);
		short sh2 = (short)(ent2);
		System.out.println("Numero de int a short: "+sh2);
	}
}
