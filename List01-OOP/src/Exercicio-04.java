import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Exercicio04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> months = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        months.put("Janeiro", 1);
        months.put("Fevereiro", 2);
        months.put("Março", 3);
        months.put("Abril", 4);
        months.put("Maio", 5);
        months.put("Junho", 6);
        months.put("Julho", 7);
        months.put("Agosto", 8);
        months.put("Setembro", 9);
        months.put("Outubro", 10);
        months.put("Novembro", 11);
        months.put("Dezembro", 12);

        System.out.println("Type the month: ");

        String userInput = scanner.nextLine();

        if (months.containsKey(userInput))
        {
            System.out.println("\"" + userInput + "\": " + months.get(userInput));
        }
        else
        {
            System.out.println("Month not found.");
        }
    }

}
