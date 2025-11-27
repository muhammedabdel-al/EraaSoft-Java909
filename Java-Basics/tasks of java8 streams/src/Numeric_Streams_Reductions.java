import java.util.*;
import java.util.stream.Collectors;

public class NumericTasks {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        // 1 - Calculate the sum of a list of integers using reduce.

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum = " + sum);



        // 2 - Find the maximum and minimum value in a list.

        int max = numbers.stream()
                .max(Integer::compare).orElse(0);
        int min = numbers.stream()
                .min(Integer::compare).orElse(0);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);




        // 3 - Calculate the average of a list of doubles.

        double avg = numbers.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0);
        System.out.println("Average = " + avg);




        // 4 - Multiply all integers in a list together using reduce.

        int mul = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Multiplication = " + mul);





        // 5 - Count how many numbers are positive in a list.

        long positive = numbers.stream()
                .filter(n -> n > 0)
                .count();
        System.out.println("Positive count = " + positive);


    }
}
