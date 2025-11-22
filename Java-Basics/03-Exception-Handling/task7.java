import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if (age < 18) {

                throw new InvalidAgeException("Age must be 18 or above!");
            }

            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {

            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
