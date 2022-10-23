package exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest
{
    private Calculadora calculadora;
    private CalculadoraCientifica cientifica;

    @BeforeEach
    public void setUp()
    {
        calculadora = new Calculadora();
        cientifica = new CalculadoraCientifica();
    }

    @Test
    public void somaCalculadora()
    {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    public void subtraiCalculadora()
    {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    public void divideCalculadora()
    {
        assertEquals(2, calculadora.divide(6, 3));
    }

    @Test
    public void multiplicaCalculadora()
    {
        assertEquals(6, calculadora.multiplica(2, 3));
    }

    @Test
    public void somaCientifica()
    {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    public void subtraiCientifica()
    {
        assertEquals(5, cientifica.soma(2, 3));
    }

    @Test
    public void divideCientifica()
    {
        assertEquals(2, cientifica.divide(6, 3));
    }

    @Test
    public void multiplicaCientifica()
    {
        assertEquals(6, cientifica.multiplica(2, 3));
    }

    @Test
    public void raizQuadrada()
    {
        assertEquals(2, cientifica.raizQuadrada(4));
    }

    @Test
    public void potencia()
    {
        assertEquals(4, cientifica.potencia(2, 2));
    }

}