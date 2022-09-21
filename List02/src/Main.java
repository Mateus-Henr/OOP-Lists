import model.*;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario maria = new Funcionario("Maria", LocalDate.parse("1998-02-03"));
        maria.contratar(TipoDeContrato.EFETIVO, 2000.00, 1, LocalDate.parse("1998-09-09"));

        Funcionario joao = new Funcionario("João", LocalDate.parse("1990-11-03"));
        joao.contratar(TipoDeContrato.HORISTA, 30.00, 0, LocalDate.parse("1994-11-13"));

        Funcionario pedro = new Funcionario("Pedro", LocalDate.parse("1980-07-07"));
        pedro.contratar(TipoDeContrato.EFETIVO, 3103.43, 1, LocalDate.parse("1990-09-12"));

        Funcionario caio = new Funcionario("Caio", LocalDate.parse("1985-02-09"));
        caio.contratar(TipoDeContrato.EFETIVO, 2000, 1, LocalDate.parse("2000-04-14"));

        Funcionario anna = new Funcionario("Anna", LocalDate.parse("1974-08-10"));
        anna.contratar(TipoDeContrato.HORISTA, 21.43, 2, LocalDate.parse("1999-02-23"));

        System.out.println("Funcionários:");

        System.out.println("\n1° Funcionário\n");
        System.out.println(maria);
        new FolhaDePagamento(maria).mostrarFolhaDePagamento();

        System.out.println("\n\n\n2° Funcionário\n");
        System.out.println(joao);
        new FolhaDePagamento(joao).mostrarFolhaDePagamento(10);

        System.out.println("\n\n\n3° Funcionário\n");
        System.out.println(pedro);
        new FolhaDePagamento(pedro).mostrarFolhaDePagamento();

        System.out.println("\n\n\n4° Funcionário\n");
        System.out.println(caio);
        new FolhaDePagamento(caio).mostrarFolhaDePagamento();

        System.out.println("\n\n\n5° Funcionário\n");
        System.out.println(anna);
        new FolhaDePagamento(anna).mostrarFolhaDePagamento(23);
    }

}