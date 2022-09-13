import java.util.Scanner;

class Exercicio09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the command: ");
        String[] command = scanner.nextLine().split(" ");

        try
        {
            switch (command[0].toUpperCase())
            {
                case "MULTIPLICA" ->
                        System.out.println("RESPOSTA: " + (Float.parseFloat(command[1]) * Float.parseFloat(command[3])));
                case "DIVIDE" ->
                {
                    float denominator = Float.parseFloat(command[3]);

                    if (denominator == 0)
                    {
                        System.out.println("Cannot divide by 0.");
                        break;
                    }

                    System.out.println("RESPOSTA: " + (Float.parseFloat(command[1]) / denominator));
                }
                case "SOMA" ->
                        System.out.println("RESPOSTA: " + (Float.parseFloat(command[1]) + Float.parseFloat(command[3])));
                case "SUBTRAI" ->
                        System.out.println("RESPOSTA: " + (Float.parseFloat(command[1]) - Float.parseFloat(command[3])));
                default -> System.out.println("Invalid operation.");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid formatting.");
        }
    }

}
