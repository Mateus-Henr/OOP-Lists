import java.util.Random;
import java.util.Scanner;

class Exercicio10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(100) + 1;
        int numberOfTries = 0;

        while (true)
        {
            System.out.println("\nGuess the number: ");

            try
            {
                int userNumber = scanner.nextInt();

                if (userNumber < randomNumber)
                {
                    System.out.println("Try a bigger number.");
                }
                else if (userNumber > randomNumber)
                {
                    System.out.println("Try a smaller number.");
                }
                else
                {
                    System.out.println("Nice one, congratulations!! Number of tries: " + numberOfTries);
                    break;
                }

                numberOfTries++;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Input must be a number.");
            }
        }
    }

}
