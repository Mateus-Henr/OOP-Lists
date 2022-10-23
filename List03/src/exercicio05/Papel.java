package exercicio05;

public class Papel implements Objeto
{
    @Override
    public boolean venceu(Objeto o1)
    {
        return o1.getTipo().equals("Pedra");
    }

    @Override
    public String getTipo()
    {
        return "Papel";
    }

}
