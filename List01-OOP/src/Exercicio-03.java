import java.util.Scanner;

class Exercicio03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Type your salary: R$");
            float salary = scanner.nextFloat();

            System.out.print("Type the loan desired value: R$");
            float desiredLoan = scanner.nextFloat();

            if (desiredLoan > (salary * 0.3))
            {
                System.out.println("\nYou ARE NOT able to get the loan.");
            }
            else
            {
                System.out.println("\nYou ARE able to get the loan.");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("\nInvalid input, it must be a number.");
        }
    }

}
