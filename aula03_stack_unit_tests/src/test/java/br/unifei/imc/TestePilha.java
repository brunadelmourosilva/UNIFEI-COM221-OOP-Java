package br.unifei.imc;

import br.unifei.imc.exception.PilhaVaziaException;
import br.unifei.imc.model.Pilha;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePilha {

    Pilha pilha;

    @Before
    public void setUp() throws Exception {
        pilha = new Pilha<Integer>();
    }

    @Test
    public void StackIsEmptyTest() {
        //when
        boolean resultado = pilha.isVazia();

        //then
        Assert.assertTrue(resultado);
    }

    @Test
    public void PushTwoElementsTest() {
        //given
        pilha.push(2);
        pilha.push(3);

        //when
        int tamanho = pilha.getTamanho();
        int topo = (int) pilha.mostraTopo();

        //then
        Assert.assertEquals(2, tamanho);
        Assert.assertEquals(3, topo);
    }

    @Test
    public void PopTest() {
        //given
        pilha.push(2);
        pilha.push(3);
        pilha.push(5);

        //when
        pilha.pop();
        int tamanho = pilha.getTamanho();
        int topo = (int) pilha.mostraTopo();

        //then
        Assert.assertEquals(2, tamanho);
        Assert.assertEquals(3, topo);
    }

    @Test(expected = PilhaVaziaException.class)
    public void PopWhenStackIsEmpty() {
        pilha.pop();
    }
}
