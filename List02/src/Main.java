import model.*;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Contrato padrao = new Contrato();
        padrao.contratar(TipoContrato.Efetivo, 2000, 1, LocalDate.parse("1998-09-09"));

        Funcionario maria = new Funcionario("Maria", LocalDate.parse("1998-02-03"), padrao);
        Funcionario joao = new Funcionario("João", LocalDate.parse("1990-11-03"), padrao);
        Funcionario pedro = new Funcionario("Maria", LocalDate.parse("1980-07-07"), padrao);
        Funcionario caio = new Funcionario("Maria", LocalDate.parse("1985-02-09"), padrao);

        FolhaDePagamentoHorista folhaDePagamento = new FolhaDePagamentoHorista(maria);

        System.out.println("Funcionários:");

        System.out.println("\n1° Funcionário\n");
        System.out.println(maria);
        System.out.println();
        folhaDePagamento.mostrarFolhaDePagamento(8);

        System.out.println("\n\n\n2° Funcionário\n");
        System.out.println(joao);
        System.out.println();
        folhaDePagamento.mostrarFolhaDePagamento(10);

        System.out.println("\n\n\n3° Funcionário\n");
        System.out.println(pedro);
        System.out.println();
        folhaDePagamento.mostrarFolhaDePagamento(8);

        System.out.println("\n\n\n4° Funcionário\n");
        System.out.println(caio);
        System.out.println();
        folhaDePagamento.mostrarFolhaDePagamento(7);
        System.out.println();
    }

}