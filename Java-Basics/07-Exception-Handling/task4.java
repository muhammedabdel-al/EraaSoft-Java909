import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] numbers = {10, 20, 30, 40, 50};

        try {

            System.out.print("Enter an index (0 to 4): ");
            int index = input.nextInt();


            System.out.println("Value = " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Index out of range! Valid indexes are 0 to 4.");
        }

        input.close();
    }
}
