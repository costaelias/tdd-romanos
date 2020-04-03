package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano = "";
		
		if (numero >= 10) {
		
			romano = concatenar("X", numero / 10);

			numero = numero - ((numero/10)*10);
		} 
		
		if (numero >= 5) {
			
			romano = romano + "V" + concatenar("I", numero - 5);
			
		} else if (numero == 4) {
			
			romano = "IV";
		
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
