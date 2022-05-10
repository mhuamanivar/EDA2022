
public class ejemplo_break_continue {

	public static void main(String[] args) {
		
		// utilizacion de break ya que aqui corta el bucle cuando encuentra la igualdad
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}

		System.out.println();
		System.out.println();
		
		// utilizacion de continue, encuentra la igualdad pero sigue hasta terminar el bucle
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
	}

}
