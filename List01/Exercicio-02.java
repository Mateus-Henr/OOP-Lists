import java.util.Scanner;

class Exercicio02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Type the numerator: ");
            int numerator = scanner.nextInt();

            System.out.println("Type the denominator: ");
            int denominator = scanner.nextInt();

            if (denominator == 0)
            {
                System.out.println("Warning: Cannot divide by 0.");
                return;
            }

            System.out.println("Result = " + (numerator / denominator));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input, it must be a number.");
        }
    }

}
