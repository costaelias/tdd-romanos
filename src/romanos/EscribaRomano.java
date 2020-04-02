package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano;
		
		if (numero == 2) {
			
			romano = "II";
		
		} else {
			
			romano = "I";
		}
		
		return romano;
	}
}
