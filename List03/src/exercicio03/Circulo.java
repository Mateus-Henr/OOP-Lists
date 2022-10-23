package exercicio03;

public class Circulo extends Forma
{
    private float raio;

    public Circulo(float raio)
    {
        this.raio = raio;
    }

    @Override
    public float calcularArea()
    {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float cacularPerimetro()
    {
        return (float) (2.0 * Math.PI * raio);
    }

    @Override
    public String getTipo()
    {
        return "Circulo";
    }

    public double getPI()
    {
        return Math.PI;
    }

    public float getRaio()
    {
        return raio;
    }

    public void setRaio(float raio)
    {
        this.raio = raio;
    }

}
