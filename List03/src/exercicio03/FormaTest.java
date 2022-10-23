package exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest
{
    private List<Forma> figuras;

    @BeforeEach
    void setUp()
    {
        figuras = new ArrayList<>();

        figuras.add(new Circulo(2));
        figuras.add(new Quadrado(2));
        figuras.add(new Retangulo(2, 3));
    }

    @Test
    void calcularArea()
    {
        for (Forma forma : figuras)
        {
            if (forma.getTipo().equals("Retangulo"))
            {
                assertEquals(6, forma.calcularArea());
            }
            else if (forma.getTipo().equals("Quadrado"))
            {
                assertEquals(4, forma.calcularArea());
            }
            else if (forma.getTipo().equals("Circulo"))
            {
                assertEquals((float) (Math.PI * 2 * 2), forma.calcularArea());
            }
        }
    }

    @Test
    void cacularPerimetro()
    {
        for (Forma forma : figuras)
        {
            if (forma.getTipo().equals("Retangulo"))
            {
                assertEquals(10, forma.cacularPerimetro());
            }
            else if (forma.getTipo().equals("Quadrado"))
            {
                assertEquals(8, forma.cacularPerimetro());
            }
            else if (forma.getTipo().equals("Circulo"))
            {
                assertEquals((float) (2 * Math.PI * 2), forma.cacularPerimetro());
            }
        }
    }

}