public class task11 {
    public class Task11 {
        public static void main(String[] args) {

            try {
                System.out.println("Inside try block");

                int result = 10 / 0; // هيتسبب في ArithmeticException

            } catch (ArithmeticException e) {
                System.out.println("Inside catch block: " + e.getMessage());

            } finally {
                // الكود هنا دايمًا بيتنفذ مهما حصل
                System.out.println("Inside finally block: This always executes!");
            }

            System.out.println("Program continues...");
        }
    }

}

