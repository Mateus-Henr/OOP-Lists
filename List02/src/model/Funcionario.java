package model;

import java.time.LocalDate;

public class Funcionario
{
    private final String nome;
    private final LocalDate dataNascimento;

    public Funcionario(String nome, LocalDate dataNascimento)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome()
    {
        return nome;
    }

    public LocalDate getDataNascimento()
    {
        return dataNascimento;
    }

    @Override
    public String toString()
    {
        return String.format("""
                        ------ Dados do Funcionário ------
                        Nome: %s
                        Data de Nascimento: %s
                        """,
                nome,
                dataNascimento);
    }

}
