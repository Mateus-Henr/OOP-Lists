package exercicio01;

public class Calculadora
{
    public double soma(double numero, double numero2)
    {
        return numero + numero2;
    }

    public double subtrai(double numero, double numero2)
    {
        return numero - numero2;
    }

    public double divide(double numerador, double denominador) throws ArithmeticException
    {
        return numerador / denominador;
    }

    public double multiplica(double numero, double numero2)
    {
        return numero * numero2;
    }

}