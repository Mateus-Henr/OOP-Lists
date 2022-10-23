package exercicio04;

public class Produto
{
    private final int serial;
    private int volume;
    private String teste;

    public Produto(int serial)
    {
        this.serial = serial;
        this.teste = "não testado";
    }

    public boolean testaUnidade()
    {
        if (teste.equals("não testado"))
        {
            if (Math.random() <= 0.9)
            {
                teste = "aprovado";
                return true;
            }
            else
            {
                teste = "reprovado";
                return false;
            }
        }

        return teste.equals("aprovado");
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public String toString()
    {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }

}
