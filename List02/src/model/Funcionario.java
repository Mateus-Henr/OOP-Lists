package model;

import java.time.LocalDate;

public class Funcionario
{
    public enum TipoContrato
    {
        Efetivo, Horista
    }

    private final String nome;

    private final LocalDate dataNascimento;

    private TipoContrato tipoContrato;

    private double salario;
    private int filhosMenoresDeIdade;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, LocalDate dataNascimento)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void contratar(double salario, int filhosMenorDeIdade, LocalDate dataAdmissao)
    {
        this.salario = salario;
        this.filhosMenoresDeIdade = filhosMenorDeIdade;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome()
    {
        return nome;
    }

    public LocalDate getDataNascimento()
    {
        return dataNascimento;
    }

    public TipoContrato getTipoContrato()
    {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato)
    {
        this.tipoContrato = tipoContrato;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public int getFilhosMenoresDeIdade()
    {
        return filhosMenoresDeIdade;
    }

    public void setFilhosMenoresDeIdade(int filhosMenoresDeIdade)
    {
        this.filhosMenoresDeIdade = filhosMenoresDeIdade;
    }

    public LocalDate getDataAdmissao()
    {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao)
    {
        this.dataAdmissao = dataAdmissao;
    }


    public double calculaSalarioBruto(int horasTrabalhadas, TipoContrato tipoContrato)
    {
        setTipoContrato(tipoContrato);

        if (tipoContrato == TipoContrato.Horista)
        {
            return horasTrabalhadas * salario;
        }

        return (horasTrabalhadas * salario) * 30;
    }

    public double calculaDescontoINSS()
    {
        if (salario <= 1659.38)
        {
            return salario * 0.08;
        }
        else if (salario >= 1659.39 && salario <= 2765.66)
        {
            return salario * 0.09;
        }
        else if (salario >= 2765.67 && salario <= 5531.31)
        {
            return salario * 0.11;
        }
        else
        {
            return 5531.31 * 0.11;
        }
    }

    public double calculaDescontoImpostoDeRenda()
    {
        if (salario <= 1903.98)
        {
            return 0;
        }
        else if (salario >= 1903.99 && salario <= 2826.65)
        {
            return (salario * 0.075) - 142.80;
        }
        else if (salario >= 2826.66 && salario <= 3751.05)
        {
            return (salario * 0.15) - 354.80;
        }
        else if (salario >= 3751.06 && salario <= 4664.68)
        {
            return (salario * 0.225) - 636.13;
        }
        else
        {
            return (salario * 0.275) - 869.36;
        }
    }

    public double calculaSalarioLiquido()
    {
        return salario - calculaDescontoINSS() - calculaDescontoImpostoDeRenda();
    }

    public void mostrarFolhaDePagamento(int horasTrabalhadas, TipoContrato tipoContrato)
    {
        System.out.printf("\n------- Folha De Pagamento -------" +
                        "\nSalário Bruto: R$ %.2f" +
                        "\nDescontos:" +
                        "\nINSS: R$ %.2f" +
                        "\nImposto De Renda: R$ %.2f" +
                        "\nSalário Liquído: R$ %.2f",
                calculaSalarioBruto(horasTrabalhadas, tipoContrato),
                calculaDescontoINSS(),
                calculaDescontoImpostoDeRenda(),
                calculaSalarioLiquido());
    }

    @Override
    public String toString()
    {
        return "\nDados do Funcionário " +
                "\nNome: '" + nome + '\'' +
                "\nContrato: " + tipoContrato +
                "\nSalário: R$ " + salario +
                "\nFilhos Menores de Idade: " + filhosMenoresDeIdade +
                "\n Data de Admissão: " + dataAdmissao;
    }

}
