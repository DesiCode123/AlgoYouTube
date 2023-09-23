import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class StreamTask {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 35),
                new Person("Mara", 19),
                new Person("James", 24),
                new Person("Chris", 17),
                new Person("Ana", 28)
        );

        people.stream()
                .filter(person -> person.getAge() > 20) // Filtrer personer eldre enn 20
                .sorted(Comparator.comparing(Person::getName)) // Sorterer listen etter navn
                .map(Person::getName) // Mapper listen til en liste av strenger (navn)
                .forEach(System.out::println); // Skriver ut hvert navn
    }
}


