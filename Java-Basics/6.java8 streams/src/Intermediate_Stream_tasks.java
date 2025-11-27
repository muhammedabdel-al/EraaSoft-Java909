import java.util.*;
import java.util.stream.Collectors;

public class IntermediateTasks {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        List<String> names = Arrays.asList(
                "Ali", "Mona", "Ahmed", "Sara", "Amr",
                "Laila", "Kareem", "Nada", "Nour", "Samy", "", null
        );

        // 1 -Count the number of strings longer than 5 characters.


        long count = names.stream()
                .filter(s -> s != null && s.length() > 5)
                .count();
        System.out.println("Strings > 5 = " + count);


        // 2 - Find the first element in a stream that matches a given condition.


        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst();
        System.out.println("First > 5 = " + first.orElse(null));


        // 3 - Check if any number is divisible by 5 in a list.


        boolean any = numbers.stream()
                .anyMatch(n -> n % 5 == 0);
        System.out.println("Any divisible by 5? " + any);


        // 4 - Collect elements into a Set instead of a List.


        Set<String> set = names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
        System.out.println("Names Set = " + set);



        // 5 - Skip the first 3 elements and return the rest.


        List<Integer> rest = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("After skip 3 = " + rest);

    }
}
