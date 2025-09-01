package jokenpo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jokenpo.Jokenpo;

@DisplayName("Classe para teste do Jokenpo")
public class JokenpoTest {
    
    private Jokenpo jogo;

// 1 - papel
// 2 - pedra
// 3 - tesoura

    @BeforeEach
    public void inicializa(){
        jogo = new Jokenpo();
    }

    @Test
    public void testaZero(){
        Assertions.assertEquals(-1, jogo.jogar(0, 0));
    }

    @Test
    public void jogador1Vence(){
        Assertions.assertEquals(1, jogo.jogar(1, 2));
        Assertions.assertEquals(1, jogo.jogar(2, 3));
        Assertions.assertEquals(1, jogo.jogar(3, 1));
    }

    @Test 
    public void jogador1Perde(){
        Assertions.assertEquals(2, jogo.jogar(2, 1));
        Assertions.assertEquals(2, jogo.jogar(3, 2));
        Assertions.assertEquals(2, jogo.jogar(1, 3));
    }

    @Test 
    public void empate(){
        Assertions.assertEquals(0, jogo.jogar(1, 1));
        Assertions.assertEquals(0, jogo.jogar(2, 2));
        Assertions.assertEquals(0, jogo.jogar(3, 3));
    }
}
