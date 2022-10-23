package exercicio02;

public class Automovel extends Veiculo
{
    @Override
    public int getNumeroRodas()
    {
        return 4;
    }

    @Override
    public void acelerar(float velocidade)
    {
        if (velocidade > 0)
        {
            System.out.println("Acelerando automovel para " + velocidade + " Km/h");
        }
        else
        {
            System.out.println("Velocidade automovel inválida");
        }
    }

    @Override
    public void parar()
    {
        System.out.println("Parando o automovel");
    }

}
