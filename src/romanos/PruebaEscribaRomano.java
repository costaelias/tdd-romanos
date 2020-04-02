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
		
		Assert.assertEquals("I", escriba.copiar(1));
	}
	
	@Test
	public void copia2ComoII() {
		
		Assert.assertEquals("II", escriba.copiar(2));
	}

	@Test
	public void copia3ComoIII() {
		
		Assert.assertEquals("III", escriba.copiar(3));
	}
}
