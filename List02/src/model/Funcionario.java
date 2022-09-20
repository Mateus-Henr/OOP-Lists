package model;

import java.time.LocalDate;

public class Funcionario
{
    private final String nome;
    private final LocalDate dataNascimento;
    private final Contrato contrato;

    public Funcionario(String nome, LocalDate dataNascimento, Contrato contrato)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contrato = contrato;
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
