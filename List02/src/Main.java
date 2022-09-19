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

        maria.contratar(1000.00, 1, LocalDate.parse("2016-02-09"), Funcionario.TipoContrato.Efetivo);
        joao.contratar(1904.00, 3, LocalDate.parse("2016-02-09"), Funcionario.TipoContrato.Efetivo);
        pedro.contratar(2900.00, 2, LocalDate.parse("2016-02-09"), Funcionario.TipoContrato.Horista);
        caio.contratar(5000.00, 0, LocalDate.parse("2016-02-09"), Funcionario.TipoContrato.Efetivo);

        System.out.println("Funcionários:");

        System.out.println("\n1° Funcionário");
        System.out.println(maria);
        maria.mostrarFolhaDePagamento(8, Funcionario.TipoContrato.Efetivo);

        System.out.println("\n\n\n2° Funcionário");
        System.out.println(joao);
        joao.mostrarFolhaDePagamento(10, Funcionario.TipoContrato.Efetivo);

        System.out.println("\n\nn3° Funcionário");
        System.out.println(pedro);
        pedro.mostrarFolhaDePagamento(8, Funcionario.TipoContrato.Horista);

        System.out.println("\n\n\n4° Funcionário");
        System.out.println(caio);
        caio.mostrarFolhaDePagamento(7, Funcionario.TipoContrato.Efetivo);
    }

}