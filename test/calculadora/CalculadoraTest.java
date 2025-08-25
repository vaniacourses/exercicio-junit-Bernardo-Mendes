package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}

	@Test
	public void testSubtraiDoisNumeros() {
		int sub = calc.subtracao(10, 6);		
		Assertions.assertEquals(4, sub);		
	}

	@Test
	public void somatorio10() {
		int soma = calc.somatoria(10);
		Assertions.assertEquals(55, soma);
	}
	
	@Test
	public void ehPositivo() {
		boolean ehPositivo = calc.ehPositivo(1);
		assertTrue(ehPositivo);
	}

	@Test
	public void naoEhPositivo() {
		boolean naoEhPositivo = calc.ehPositivo(-1);
		Assertions.assertEquals(false, naoEhPositivo);
	}

	@Test
	public void comparaIgual() {
		int retorno = calc.compara();
		Assertions.assertEquals(false, naoEhPositivo);
	}

	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

}
