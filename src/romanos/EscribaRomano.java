package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano = "";
		
		if (numero >= 10) {
		
			romano = romano + concatenar("X", numero / 10);

			numero = numero % 10;
		} 
		
		if (numero >= 5) {
			
			romano = romano + concatenar("V", numero / 5);
			
			numero = numero % 5;
		}
		
		if (numero == 4) {
			
			romano = romano + "IV";
		
		} else if (numero >= 1) {

			romano = romano + concatenar("I", numero);
		}

		return romano;
	}
	
	private String concatenar(String simbolo, int cantidad) {
		
		String cadena = "";
		
		for (int i = 0; i < cantidad; i++) {
			
			cadena = cadena + simbolo;
		}
		
		return cadena;
	}
}
