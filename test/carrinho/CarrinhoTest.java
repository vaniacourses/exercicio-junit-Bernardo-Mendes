package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")

public class CarrinhoTest{
    private Carrinho car;
    private Produto p1;
    private Produto p2;
    private static Integer i;


    @BeforeEach
    public void inicializa(){
        car = new Carrinho();
        p1 = new Produto("Camiseta1", 120.00);
        p2 = new Produto("Tenis1", 1200.00);
    }

    @Test
    public void adicionaProduto(){
        car.addItem(p1);
        Assertions.assertEquals(1, car.getQtdeItems());
    }

    @Test
    public void pegaValorTotal(){
        car.addItem(p1);
        car.addItem(p2);
        Assertions.assertEquals(1320.00, car.getValorTotal());
    }

    @Test
    public void removeItem(){
        car.addItem(p1);
        car.addItem(p2);
        try {
            car.removeItem(p1);
        } catch (ProdutoNaoEncontradoException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(1200.00, car.getValorTotal());
    }

    @Test
    public void esvaziaLixeira(){
        car.addItem(p1);
        car.addItem(p2);
        car.esvazia();
        Assertions.assertEquals(0, car.getQtdeItems());
    }


}