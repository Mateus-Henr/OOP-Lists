package exercicio05;

public class Pedra implements Objeto
{
    @Override
    public boolean venceu(Objeto o1)
    {
        return o1.getTipo().equals("Tesoura");
    }

    @Override
    public String getTipo()
    {
        return "Pedra";
    }

}
