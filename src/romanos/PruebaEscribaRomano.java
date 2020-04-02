package romanos;

import org.junit.Test;

public class PruebaEscribaRomano {

	@Test
	public void creaElEscribaRomanoSinParametros() {
		
		new EscribaRomano();
	}

	@Test
	public void copia1ComoI() {
		
		EscribaRomano escriba = new EscribaRomano();
		
		String numeroRomano = escriba.copiar(1);
	}
	
}
