public class task11 {
    public class Task11 {
        public static void main(String[] args) {

            try {
                System.out.println("Inside try block");

                int result = 10 / 0;

            } catch (ArithmeticException e) {
                System.out.println("Inside catch block: " + e.getMessage());

            } finally {

                System.out.println("Inside finally block: This always executes!");
            }

            System.out.println("Program continues...");
        }
    }

}

