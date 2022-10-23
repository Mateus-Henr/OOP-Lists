package exercicio02;

import java.time.LocalDate;

public abstract class Veiculo
{
    LocalDate dataTrocaOleo;

    public abstract int getNumeroRodas();

    public abstract void acelerar(float velocidade);

    public abstract void parar();

    public void trocarOleo()
    {
        dataTrocaOleo = LocalDate.now();
        System.out.println("Nova data troca de óleo: " + dataTrocaOleo);
    }

}
