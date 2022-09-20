package model;

import java.time.LocalDate;

public class Contrato
{
    private TipoContrato tipoContrato;
    private double salario;
    private int filhosMenoresDeIdade;
    private LocalDate dataAdmissao;

    public void contratar(TipoContrato tipoContrato, double salario, int filhosMenorDeIdade, LocalDate dataAdmissao)
    {
        this.tipoContrato = tipoContrato;
        this.salario = salario;
        this.filhosMenoresDeIdade = filhosMenorDeIdade;
        this.dataAdmissao = dataAdmissao;
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

}
