package calculadora;

import calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GPTCalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    // --- Testes de soma ---
    @Test
    void somaDeDoisNumerosPositivos() {
        assertEquals(7, calculadora.soma(3, 4));
    }

    @Test
    void somaDeNumeroPositivoComNegativo() {
        assertEquals(1, calculadora.soma(5, -4));
    }

    @Test
    void somaDeDoisNumerosNegativos() {
        assertEquals(-9, calculadora.soma(-5, -4));
    }

    // --- Testes de subtração ---
    @Test
    void subtracaoDeDoisNumerosPositivos() {
        assertEquals(2, calculadora.subtracao(5, 3));
    }

    @Test
    void subtracaoQueGeraResultadoNegativo() {
        assertEquals(-1, calculadora.subtracao(3, 4));
    }

    // --- Testes de multiplicação ---
    @Test
    void multiplicacaoDeDoisPositivos() {
        assertEquals(20, calculadora.multiplicacao(5, 4));
    }

    @Test
    void multiplicacaoComZero() {
        assertEquals(0, calculadora.multiplicacao(5, 0));
    }

    @Test
    void multiplicacaoComNegativo() {
        assertEquals(-15, calculadora.multiplicacao(5, -3));
    }

    // --- Testes de divisão ---
    @Test
    void divisaoDeDoisPositivos() {
        assertEquals(2, calculadora.divisao(10, 5));
    }

    @Test
    void divisaoComResultadoNaoInteiro() {
        assertEquals(3, calculadora.divisao(10, 3)); // divisão inteira
    }

    @Test
    void divisaoPorZeroLancaExcecao() {
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(10, 0));
    }

    // --- Testes de somatória ---
    @Test
    void somatoriaDeZero() {
        assertEquals(0, calculadora.somatoria(0));
    }

    @Test
    void somatoriaDeNumeroPositivo() {
        assertEquals(15, calculadora.somatoria(5)); // 0+1+2+3+4+5
    }

    @Test
    void somatoriaDeNumeroNegativoRetornaZero() {
        assertEquals(0, calculadora.somatoria(-3)); // loop não roda
    }

    // --- Testes de ehPositivo ---
    @Test
    void numeroPositivoEhPositivo() {
        assertTrue(calculadora.ehPositivo(5));
    }

    @Test
    void numeroZeroEhPositivo() {
        assertTrue(calculadora.ehPositivo(0));
    }

    @Test
    void numeroNegativoNaoEhPositivo() {
        assertFalse(calculadora.ehPositivo(-5));
    }

    // --- Testes de compara ---
    @Test
    void comparaDoisNumerosIguais() {
        assertEquals(0, calculadora.compara(5, 5));
    }

    @Test
    void comparaPrimeiroMaiorQueSegundo() {
        assertEquals(1, calculadora.compara(10, 5));
    }

    @Test
    void comparaPrimeiroMenorQueSegundo() {
        assertEquals(-1, calculadora.compara(3, 7));
    }
}
