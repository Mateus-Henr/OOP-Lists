package exercicio05;

public class Tesoura implements Objeto
{
    @Override
    public boolean venceu(Objeto o1)
    {
        return o1.getTipo().equals("Papel");
    }

    @Override
    public String getTipo()
    {
        return "Tesoura";
    }

}
