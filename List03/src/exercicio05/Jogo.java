package exercicio05;

import java.util.Random;

public class Jogo
{
    private static final Random random = new Random();

    public void jogar()
    {
        while (true)
        {
            Objeto o1 = escolheObjeto(random.nextInt(3));
            Objeto o2 = escolheObjeto(random.nextInt(3));

            if (o1 != null && o2 != null)
            {
                if (o1.venceu(o2))
                {
                    System.out.println("Vitória jogador 1 - " + o1.getTipo() + " venceu " + o2.getTipo());
                }
                else
                {
                    System.out.println("Vitória jogador 2 - " + o2.getTipo() + " venceu " + o1.getTipo());
                }
            }
        }
    }

    public Objeto escolheObjeto(int randInt)
    {
        Objeto o1 = null;

        switch (randInt)
        {
            case 0 -> o1 = new Pedra();
            case 1 -> o1 = new Tesoura();
            case 2 -> o1 = new Papel();
            default -> o1 = null;
        }

        return o1;
    }

}