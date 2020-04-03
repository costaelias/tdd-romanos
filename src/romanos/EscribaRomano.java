package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano = "";
		
		if (numero == 6) {
			
			romano = "VI";
			
		} else if (numero == 5) {
			
			romano = "V";
			
		} else if (numero == 4) {
			
			romano = "IV";
		
		} else {
			
			for (int i = numero; i > 0; i--) {
				
				romano = romano + "I";
			}
		}

		return romano;
	}
}
