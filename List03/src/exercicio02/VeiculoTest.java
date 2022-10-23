package exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest
{
    private Automovel automovel;
    private Bicicleta bicicleta;

    @BeforeEach
    void setUp()
    {
        automovel = new Automovel();
        bicicleta = new Bicicleta();
    }

    @Test
    void getNumeroRodasBicicleta()
    {
        assertEquals(2, bicicleta.getNumeroRodas());
    }

    @Test
    void acelerarBicicleta()
    {
        bicicleta.acelerar(2);
    }

    @Test
    void pararBicicleta()
    {
        bicicleta.parar();
    }

    @Test
    void trocarOleoBicicleta()
    {
        bicicleta.trocarOleo();
    }

    @Test
    void getNumeroRodasAutomovel()
    {
        assertEquals(4, automovel.getNumeroRodas());
    }

    @Test
    void acelerarAutomovel()
    {
        automovel.acelerar(2);
    }

    @Test
    void pararAutomovel()
    {
        automovel.parar();
    }

    @Test
    void trocarOleoAutomovel()
    {
        automovel.trocarOleo();
    }

}