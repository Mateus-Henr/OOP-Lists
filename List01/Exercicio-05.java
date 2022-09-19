import java.util.Scanner;

class Exercicio05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Month[] months = {
                new Month("Janeiro", 31),
                new Month("Fevereiro", 28),
                new Month("Março", 31),
                new Month("Abril", 30),
                new Month("Maio", 31),
                new Month("Junho", 30),
                new Month("Julho", 31),
                new Month("Agosto", 31),
                new Month("Setembro", 30),
                new Month("Outubro", 31),
                new Month("Novembro", 30),
                new Month("Dezembro", 31),
        };

        try
        {
            System.out.println("Day: ");
            int day = scanner.nextInt();

            System.out.println("Month: ");
            int month = scanner.nextInt();

            if (month > 0 && month < 13)
            {
                if (day <= months[month - 1].days)
                {
                    System.out.println("The date is valid, month: " + months[month - 1].name + ".");
                }
                else
                {
                    System.out.println("Error: Invalid day");
                }
            }
            else
            {
                System.out.println("Error: Invalid month");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid value.");
        }

    }

    private static class Month
    {
        String name;
        int days;

        public Month(String name, int days)
        {
            this.name = name;
            this.days = days;
        }

    }

}
