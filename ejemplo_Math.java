
public class ejemplo_Math {
	public static void main(String[] args) {
		// metodo Math.max
		System.out.println(Math.max(5, 20));
		
		//metodo Math.min
		System.out.println(Math.min(5, 20));
		
		//metodo para raiz
		System.out.println(Math.sqrt(81));
		
		//metodo para valor absoluto
		System.out.println(Math.abs(-81));
		
		//numero al azar
		System.out.println(Math.random());
		
		//numero al azar pero controlado por un rango entre 0 al 100
		int randomNum = (int)(Math.random() * 101); 
		System.out.println(randomNum);
	}
}
