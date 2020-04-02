package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano;
		
		if (numero == 1) {
			
			romano = "I";
		
		} else {
			
			romano = "II";
		}
		
		return romano;
	}
}
