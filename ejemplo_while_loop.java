
public class ejemplo_while_loop {

	public static void main(String[] args) {
	
		// ejemplo de while--- mostrar los primero 5 numeros
		
		int i=1;
		while(i<=5) {
			int num=0;
			num+=i;
			System.out.println(num);
			i++;
		}
		
		// variacion de while do/while
		System.out.println("");
		int j = 1;
		do {
		  System.out.println(j);
		  j++;
		}
		while (j <= 5);
	}

}
