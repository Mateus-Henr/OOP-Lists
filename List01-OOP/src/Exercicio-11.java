import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercicio11
{
    public static void main(String[] args)
    {
        // Format: Name|Genre|Weight|Age|Height
        //     (String) (Char) (Float) (Int) (Float)
        Pattern p = Pattern.compile("(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)");

        ArrayList<Person> people = new ArrayList<>();

        try
        {
            Path dataPath = FileSystems.getDefault().getPath("src/data.txt");

            List<String> lines = Files.readAllLines(dataPath);

            for (String line : lines)
            {
                Matcher m = p.matcher(line);

                if (m.find())
                {
                    people.add(new Person(m.group(1),
                            m.group(2).charAt(0),
                            Float.parseFloat(m.group(3)),
                            Integer.parseInt(m.group(4)),
                            Float.parseFloat(m.group(5))));
                }

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        if (people.isEmpty())
        {
            return;
        }

        System.out.println("Number of patients = " + people.size() +
                "\nMale age mean = " +
                (people.stream()
                        .filter(person -> person.genre == 'M')
                        .map(person -> person.age)
                        .reduce(0, Integer::sum) / people.size()) + " y/o" +
                "\nNumber of women with height between 1.60 and 1.70 and weight above 70kg = " +
                people.stream()
                        .filter(person -> person.height >= 1.60 && person.height < 1.70 && person.weight > 70 && person.genre == 'F')
                        .count() +
                "\nNumber of people between 18 and 25 y/o = " +
                people.stream()
                        .filter(person -> person.age > 18 && person.age < 25)
                        .count() +
                "\nOldest patient's name = " +
                people.stream()
                        .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                        .get().name +
                "\nShortest woman's name = " +
                (people.stream()
                        .filter(person -> person.genre == 'F')
                        .reduce((p1, p2) -> p1.height < p2.height ? p1 : p2)
                        .map(person -> person.name)
                        .orElse(null))
        );
    }

    private static class Person
    {
        String name;
        char genre;
        float weight;
        int age;
        float height;

        public Person(String name, char genre, float weight, int age, float height)
        {
            this.name = name;
            this.genre = genre;
            this.weight = weight;
            this.age = age;
            this.height = height;
        }

    }

}
