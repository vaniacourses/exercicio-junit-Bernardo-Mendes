package jokenpo;

import jokenpo.Jokenpo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GPTJokenpoTest {

    private Jokenpo jokenpo;

    @BeforeEach
    void setUp() {
        jokenpo = new Jokenpo();
    }

    // --- Testes de empate ---
    @Test
    void deveRetornarEmpateQuandoAmbosEscolhemPapel() {
        assertEquals(0, jokenpo.jogar(1, 1));
    }

    @Test
    void deveRetornarEmpateQuandoAmbosEscolhemPedra() {
        assertEquals(0, jokenpo.jogar(2, 2));
    }

    @Test
    void deveRetornarEmpateQuandoAmbosEscolhemTesoura() {
        assertEquals(0, jokenpo.jogar(3, 3));
    }

    // --- Testes de vitórias do jogador 1 ---
    @Test
    void papelVencePedra() {
        assertEquals(1, jokenpo.jogar(1, 2));
    }

    @Test
    void pedraVenceTesoura() {
        assertEquals(1, jokenpo.jogar(2, 3));
    }

    @Test
    void tesouraVencePapel() {
        assertEquals(1, jokenpo.jogar(3, 1));
    }

    // --- Testes de vitórias do jogador 2 ---
    @Test
    void papelPerdeParaTesoura() {
        assertEquals(2, jokenpo.jogar(1, 3));
    }

    @Test
    void pedraPerdeParaPapel() {
        assertEquals(2, jokenpo.jogar(2, 1));
    }

    @Test
    void tesouraPerdeParaPedra() {
        assertEquals(2, jokenpo.jogar(3, 2));
    }

    // --- Testes de entradas inválidas ---
    @Test
    void jogador1Invalido() {
        assertEquals(-1, jokenpo.jogar(0, 2));
    }

    @Test
    void jogador2Invalido() {
        assertEquals(-1, jokenpo.jogar(2, 4));
    }

    @Test
    void ambosInvalidos() {
        assertEquals(-1, jokenpo.jogar(-5, 7));
    }
}
