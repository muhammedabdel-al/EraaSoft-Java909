import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number (as String): ");
            String str = input.nextLine();
            int number = Integer.parseInt(str);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! Please enter digits only.");
        }
        input.close();
    }
}
