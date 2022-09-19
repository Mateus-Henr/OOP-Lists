import java.util.Arrays;
import java.util.Scanner;

class Exercicio07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Type a number between 0 and 1000");
            int qtyOfNumbers = scanner.nextInt();

            if (qtyOfNumbers < 0 || qtyOfNumbers > 1000)
            {
                System.out.println("Invalid number.");
                return;
            }

            int[] numbers = new int[qtyOfNumbers];

            for (int i = 0; i < qtyOfNumbers; i++)
            {
                try
                {
                    numbers[i] = scanner.nextInt();
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Not a number.");
                }
            }

            if (numbers.length == 0)
            {
                return;
            }

            long evenNumTotal = Arrays.stream(numbers).filter(value -> (value % 2) == 0).count();

            System.out.println("Smallest value: " + Arrays.stream(numbers).min().getAsInt() +
                    "\nArithmetic mean: " + (Arrays.stream(numbers).sum() / qtyOfNumbers) +
                    "\nBiggest value: " + Arrays.stream(numbers).max().getAsInt() +
                    "\nQuantity of even numbers: " + evenNumTotal +
                    "\nQuantity of odd numbers: " + (qtyOfNumbers - evenNumTotal));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid value.");
        }
    }

}
