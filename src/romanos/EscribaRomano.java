package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano = "";
		
		for (int i = numero; i > 0; i--) {
			
			romano = romano + "I";
		}
		
		return romano;
	}
}
