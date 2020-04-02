package romanos;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEscribaRomano {

	private EscribaRomano escriba = new EscribaRomano();

	@Test
	public void creaElEscribaRomanoSinParametros() {
		
		new EscribaRomano();
	}

	@Test
	public void copia1ComoI() {
		
		String numeroRomano = escriba.copiar(1);
		
		Assert.assertEquals("I", numeroRomano);
	}
	
	@Test
	public void copia2ComoII() {
		
		String numeroRomano = escriba.copiar(2);
		
		Assert.assertEquals("II", numeroRomano);
	}

}
