package model;

public class FolhaDePagamentoEfetivo extends FolhaDePagamento
{
    public FolhaDePagamentoEfetivo(Funcionario funcionario)
    {
        super(funcionario);
    }

    public double calculaSalarioBruto()
    {
        Contrato contrato = funcionario.getContrato();

        return contrato.getSalario();
    }

    public double calculaDescontoINSS()
    {
        double salario = funcionario.getContrato().getSalario();

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
        double salario = funcionario.getContrato().getSalario();

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
        double salario = funcionario.getContrato().getSalario();

        return salario - calculaDescontoINSS() - calculaDescontoImpostoDeRenda();
    }

    public void mostrarFolhaDePagamento()
    {
        System.out.printf("""
                        ------- Folha de Pagamento -------
                        Nome: %s
                        Salário Bruto: R$ %.2f
                        Descontos:
                        INSS: R$ %.2f
                        Imposto de Renda: R$ %.2f
                        Salário Liquído: R$ %.2f""",
                funcionario.getNome(),
                calculaSalarioBruto(),
                calculaDescontoINSS(),
                calculaDescontoImpostoDeRenda(),
                calculaSalarioLiquido());
    }

}