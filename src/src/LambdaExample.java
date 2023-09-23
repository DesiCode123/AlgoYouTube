import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

    public static List<String> words = Arrays.asList("apple", "banana", "cherry"); // Eksempelverdier

    public List<String> uppercaseWords() {

        return words.stream()
                .map(word -> word.toLowerCase())

                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        List<String> uppercasedWords = example.uppercaseWords();
        System.out.println(uppercasedWords);

    }
}
