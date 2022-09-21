package model;

import java.time.LocalDate;

public class Contrato
{
    private TipoDeContrato tipoContrato;
    private double salario;
    private int filhosMenoresDeIdade;
    private LocalDate dataAdmissao;

    public Contrato(TipoDeContrato tipoContrato, double salario, int filhosMenorDeIdade, LocalDate dataAdmissao)
    {
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.filhosMenoresDeIdade = filhosMenorDeIdade;
        this.dataAdmissao = dataAdmissao;
    }

    public TipoDeContrato getTipoContrato()
    {
        return tipoContrato;
    }

    public void setTipoContrato(TipoDeContrato tipoContrato)
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

    public String toString()
    {
        return String.format("""
                        Tipo de Contrato: %s
                        Salário: %.2f
                        Filhos Menores de Idade: %d
                        Data de Admissão: %s
                        """,
                tipoContrato,
                salario,
                filhosMenoresDeIdade,
                dataAdmissao);
    }

}
