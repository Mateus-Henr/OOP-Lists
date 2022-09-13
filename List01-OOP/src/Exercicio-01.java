import java.util.Scanner;

class Exercicio01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Type the current year:");
            int currYear = scanner.nextInt();

            System.out.println("Type the year of your birth:");
            int birthYear = scanner.nextInt();

            if (birthYear > currYear)
            {
                System.out.println("Invalid value. Current year cannot be greater than birth year.");
            }
            else
            {
                System.out.println("Your current age is: " + (currYear - birthYear) + " years old.");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid value, not a number.");
        }
    }

}
