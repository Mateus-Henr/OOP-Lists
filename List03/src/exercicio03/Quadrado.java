package exercicio03;

public class Quadrado extends Retangulo
{
    public Quadrado(float lado)
    {
        super(lado, lado);
    }

    @Override
    public String getTipo()
    {
        return "Quadrado";
    }

    @Override
    public void setLado(float lado)
    {
        super.setLado(lado);
        super.setAltura(lado);
    }

    @Override
    public void setAltura(float altura)
    {
        super.setLado(altura);
        super.setAltura(altura);
    }

}
