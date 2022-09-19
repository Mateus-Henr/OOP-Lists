import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercicio06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");

        System.out.println("Type the initial time in the format (HH:MM:SS)");
        String unmodifiedInitialTime = scanner.nextLine();

        Matcher m = p.matcher(unmodifiedInitialTime);

        int[] initialTime = new int[3];

        if (!m.find())
        {
            System.out.println("Invalid format");
            return;
        }

        initialTime[0] = Integer.parseInt(m.group(1));
        initialTime[1] = Integer.parseInt(m.group(2));
        initialTime[2] = Integer.parseInt(m.group(3));

        System.out.println("Type the final time in the format (HH:MM:SS)");
        String unmodifiedFinalTime = scanner.nextLine();

        m = p.matcher(unmodifiedFinalTime);

        int[] finalTime = new int[3];

        if (!m.find())
        {
            System.out.println("Invalid format");
            return;
        }

        finalTime[0] = Integer.parseInt(m.group(1));
        finalTime[1] = Integer.parseInt(m.group(2));
        finalTime[2] = Integer.parseInt(m.group(3));

        System.out.println("Difference in seconds = " +
                (getTimeInSeconds(finalTime) - getTimeInSeconds(initialTime)) +
                " seconds.");
    }

    private static int getTimeInSeconds(int[] timestamp)
    {
        return timestamp[0] * 3600 + timestamp[1] * 60 + timestamp[2];
    }
}
