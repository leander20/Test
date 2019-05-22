import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoTest {
	
	@Test
	void testExecutaSoma() {
		
		float param1 = 10;
		float param2 = 5;
		float expectResult = 15;
		
		Calculo c = new Calculo();
		
		float result = c.soma(param1, param2);
		
		assertEquals(expectResult, result);
	}
	
	@Test
	void testExecutaMultiplicacao() {
		
		float param1 = 10;
		float param2 = 5;
		float expectResult = 50;
		
		Calculo c = new Calculo();
		
		float result = c.multiplicacao(param1, param2);
		
		assertEquals(expectResult, result);
	}
}
