import java.time.LocalDate;

public class Funcionario
{
    private final String nome;
    private final LocalDate dataNascimento;
    private Contrato contrato;

    public Funcionario(String nome, LocalDate dataNascimento)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void contratar(TipoDeContrato tipoContrato, double salario, int filhosMenorDeIdade, LocalDate dataAdmissao)
    {
        this.contrato = new Contrato(tipoContrato, salario, filhosMenorDeIdade, dataAdmissao);
    }

    public String getNome()
    {
        return nome;
    }

    public LocalDate getDataNascimento()
    {
        return dataNascimento;
    }

    public Contrato getContrato()
    {
        return contrato;
    }

    public void setContrato(Contrato contrato)
    {
        this.contrato = contrato;
    }

    @Override
    public String toString()
    {
        return String.format("""
                        ------ Dados do Funcionário ------
                        Nome: %s
                        Data de Nascimento: %s
                        %s
                        """,
                nome,
                dataNascimento,
                contrato.toString());
    }

}
