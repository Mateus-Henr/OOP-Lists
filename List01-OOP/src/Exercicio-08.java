import java.util.ArrayList;
import java.util.Scanner;

class Exercicio08
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true)
        {
            System.out.println("Type a number or 'fim' word");

            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("fim"))
            {
                break;
            }

            try
            {
                numbers.add(Integer.parseInt(userInput));
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid value.");
            }
        }

        System.out.println("\nNumbers sorted");
        numbers.stream().sorted().forEach(System.out::println);
    }

}
