package exercicio01;

class CalculadoraCientifica extends Calculadora
{
    public double raizQuadrada(double number)
    {
        return Math.sqrt(number);
    }

    public double potencia(double number, double potencia)
    {
        return Math.pow(number, potencia);
    }

}