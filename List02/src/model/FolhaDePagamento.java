package model;

public class FolhaDePagamento
{
    protected Funcionario funcionario;

    public FolhaDePagamento(Funcionario funcionario)
    {
        this.funcionario = funcionario;
    }

    public double calculaSalarioBruto()
    {
        return funcionario.getContrato().getSalario();
    }

    public double calculaSalarioBruto(int horasTrabalhadas)
    {
        Contrato contrato = funcionario.getContrato();

        if (contrato.getTipoContrato() == TipoDeContrato.HORISTA)
        {
            return horasTrabalhadas * contrato.getSalario();
        }

        return contrato.getSalario();
    }

    public double calculaDescontoINSS(int horasTrabalhadas)
    {
        double salario = funcionario.getContrato().getSalario() * horasTrabalhadas;

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

    public double calculaDescontoINSS()
    {
        return calculaDescontoINSS(1);
    }

    public double calculaDescontoImpostoDeRenda(int horasTrabalhadas)
    {
        double salario = funcionario.getContrato().getSalario() * horasTrabalhadas;

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

    public double calculaDescontoImpostoDeRenda()
    {
        return calculaDescontoImpostoDeRenda(1);
    }

    public double calculaSalarioLiquido()
    {
        return funcionario.getContrato().getSalario() - calculaDescontoINSS() - calculaDescontoImpostoDeRenda();
    }

    public double calculaSalarioLiquido(int horasTrabalhadas)
    {
        double salario = funcionario.getContrato().getSalario() * horasTrabalhadas;

        return salario - calculaDescontoINSS(horasTrabalhadas) - calculaDescontoImpostoDeRenda(horasTrabalhadas);
    }

    public void mostrarFolhaDePagamento()
    {
        mostrarFolhaDePagamento(1);
    }

    public void mostrarFolhaDePagamento(int horasTrabalhadas)
    {
        System.out.printf("""
                        ------- Folha de Pagamento -------
                        Nome: %s
                        Salário Bruto: R$ %.2f
                        Descontos:
                        INSS: R$ %.2f
                        Imposto de Renda: R$ %.2f
                        Salário Liquído: R$ %.2f
                        """,
                funcionario.getNome(),
                calculaSalarioBruto(horasTrabalhadas),
                calculaDescontoINSS(horasTrabalhadas),
                calculaDescontoImpostoDeRenda(horasTrabalhadas),
                calculaSalarioLiquido(horasTrabalhadas));
    }

}
