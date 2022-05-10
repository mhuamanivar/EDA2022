
public class ejemplo_if_else {

	public static void main(String[] args) {
	//ejemplo de if else de manera tradicional	
		System.out.println("ejemplo manera tradicional");
		System.out.println("-------------------------------");
		
		int hora=10;
		
		
		//mostrar si es dia o noche
		
		if(hora<=12) {
			System.out.println("Es de mañana");
		}
		else
		{
			System.out.println("Es de noche");
		}
		
		System.out.println("");
		System.out.println("-------------------------------");

		System.out.println("ejemplo simplificado");
		System.out.println("-------------------------------");
	// ejemplo de if else simplificado
		int time = 20;
		String result = (time < 12) ? "Buenos dias... " : "Buenas noches... ";
		System.out.println(result);
	}

}
