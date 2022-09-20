import model.*;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario maria = new Funcionario("Maria", LocalDate.parse("1998-02-03"));
        maria.contratar(TipoContrato.EFETIVO, 2000.00, 1, LocalDate.parse("1998-09-09"));

        Funcionario joao = new Funcionario("João", LocalDate.parse("1990-11-03"));
        joao.contratar(TipoContrato.HORISTA, 30.00, 0, LocalDate.parse("1994-11-13"));

        Funcionario pedro = new Funcionario("Pedro", LocalDate.parse("1980-07-07"));
        pedro.contratar(TipoContrato.EFETIVO, 3103.43, 1, LocalDate.parse("1990-09-12"));

        Funcionario caio = new Funcionario("Caio", LocalDate.parse("1985-02-09"));
        caio.contratar(TipoContrato.EFETIVO, 2000, 1, LocalDate.parse("2000-04-14"));

        System.out.println("Funcionários:");

        System.out.println("\n1° Funcionário\n");
        System.out.println(maria);
        new FolhaDePagamentoEfetivo(maria).mostrarFolhaDePagamento();

        System.out.println("\n\n\n2° Funcionário\n");
        System.out.println(joao);
        new FolhaDePagamentoHorista(joao).mostrarFolhaDePagamento(10);

        System.out.println("\n\n\n3° Funcionário\n");
        System.out.println(pedro);
        new FolhaDePagamentoEfetivo(pedro).mostrarFolhaDePagamento();

        System.out.println("\n\n\n4° Funcionário\n");
        System.out.println(caio);
        new FolhaDePagamentoEfetivo(caio).mostrarFolhaDePagamento();
    }

}