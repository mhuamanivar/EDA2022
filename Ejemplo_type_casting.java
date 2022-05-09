public class Ejemplo_type_casting
{
	public static void main(String args[]) {
		        
		//Casting automatico
		byte bt = 1;
		System.out.println("Numero de tipo byte: "+bt);
		short sh = bt;
		System.out.println("Numero de byte a short: "+sh);
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
		byte bt2 = (byte)(sh2);
		System.out.println("Numero de short a byte: "+bt2);
	}
}
