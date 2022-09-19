import model.Funcionario;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario maria = new Funcionario("Maria", LocalDate.parse("1998-02-03"));
        Funcionario joao = new Funcionario("João", LocalDate.parse("1990-11-03"));
        Funcionario pedro = new Funcionario("Maria", LocalDate.parse("1980-07-07"));
        Funcionario caio = new Funcionario("Maria", LocalDate.parse("1985-02-09"));

        maria.contratar(Funcionario.TipoContrato.Efetivo, 1000.00, 1, LocalDate.parse("2016-02-09"));
        joao.contratar(Funcionario.TipoContrato.Efetivo, 1905.00, 3, LocalDate.parse("2016-02-09"));
        pedro.contratar(Funcionario.TipoContrato.Efetivo, 2900.00, 2, LocalDate.parse("2016-02-09"));
        caio.contratar(Funcionario.TipoContrato.Efetivo, 5000.00, 0, LocalDate.parse("2016-02-09"));

        System.out.println("Funcionários:");

        System.out.println("\n1° Funcionário\n");
        System.out.println(maria);
        System.out.println();
        maria.mostrarFolhaDePagamento(8, Funcionario.TipoContrato.Efetivo);

        System.out.println("\n\n\n2° Funcionário\n");
        System.out.println(joao);
        System.out.println();
        joao.mostrarFolhaDePagamento(10, Funcionario.TipoContrato.Efetivo);

        System.out.println("\n\n\n3° Funcionário\n");
        System.out.println(pedro);
        System.out.println();
        pedro.mostrarFolhaDePagamento(8, Funcionario.TipoContrato.Horista);

        System.out.println("\n\n\n4° Funcionário\n");
        System.out.println(caio);
        System.out.println();
        caio.mostrarFolhaDePagamento(7, Funcionario.TipoContrato.Efetivo);
        System.out.println();
    }

}