import java.util.*;
import java.util.stream.Collectors;

public class MapFlatMapTasks {
    public static void main(String[] args) {

        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );

        List<String> words = Arrays.asList("Ali", "Apple", "Amr", "Sara", "Nada");

        List<Optional<String>> optionals = Arrays.asList(
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("Stream"),
                Optional.empty(),
                Optional.of("API")
        );

        // 1 - Flatten a list of lists into a single list.

        List<String> flat = nestedWords.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("Flattened = " + flat);




        // 2 - Extract all unique characters from a list of words.

        Set<Character> chars = words.stream()
                .filter(Objects::nonNull)
                .flatMap(w -> w.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        System.out.println("Unique chars = " + chars);




        // 3 - Filter a list of Optionals and collect non-empty values.

        List<String> nonEmpty = optionals.stream()
                .flatMap(o -> o.isPresent() ? Arrays.stream(new String[]{o.get()}) : Arrays.stream(new String[]{}))
                .collect(Collectors.toList());
        System.out.println("Non-empty optionals = " + nonEmpty);




        // 4 - Map a list of strings to their lengths.

        List<Integer> lengths = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println("Lengths = " + lengths);




        // 5 - Return a list of uppercased words that start with “A”.

        List<String> startsWithA = words.stream()
                .filter(w -> w.startsWith("A"))
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Uppercase A-words = " + startsWithA);



    }
}
