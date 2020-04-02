package romanos;

import org.junit.Assert;
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
		
		Assert.assertEquals("I", numeroRomano);
	}
	
	@Test
	public void copia2ComoII() {
		
		EscribaRomano escriba = new EscribaRomano();
		
		String numeroRomano = escriba.copiar(2);
		
		Assert.assertEquals("II", numeroRomano);
	}

}
