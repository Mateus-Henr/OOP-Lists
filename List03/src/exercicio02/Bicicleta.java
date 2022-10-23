package exercicio02;

public class Bicicleta extends Veiculo
{
    @Override
    public int getNumeroRodas()
    {
        return 2;
    }

    @Override
    public void acelerar(float velocidade)
    {
        if (velocidade > 0)
        {
            System.out.println("Acelerando bicicleta para " + velocidade + " Km/h");
        }
        else
        {
            System.out.println("Velocidade bicicleta inválida");
        }
    }

    @Override
    public void parar()
    {
        System.out.println("Parando a bicicleta");
    }

}
