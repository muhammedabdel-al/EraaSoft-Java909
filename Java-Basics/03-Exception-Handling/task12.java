public class task12 {
    public class Task12 {
        public static void main(String[] args) {

            try {
                System.out.println("Inside outer try block");

                try {
                    System.out.println("Inside inner try block");

                    int result = 10 / 0;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner catch: Array index problem");
                }

            } catch (ArithmeticException e) {

                System.out.println("Outer catch: Caught ArithmeticException - " + e.getMessage());
            }

            System.out.println("Program continues...");
        }
    }

}
