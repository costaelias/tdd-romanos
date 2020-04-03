package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano = "";
		
		if (numero >= 30) {
		
			romano = concatenar("X", numero / 10);
			
		} else if (numero >= 5) {
			
			romano = "V" + concatenarI(numero - 5);
			
		} else if (numero == 4) {
			
			romano = "IV";
		
		} else {

			romano = concatenarI(numero);
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
	
	private String concatenarI(int cantidad) {
		
		String cadena = "";
		
		for (int i = 0; i < cantidad; i++) {
			
			cadena = cadena + "I";
		}
		
		return cadena;
	}
}
