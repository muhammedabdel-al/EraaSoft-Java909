public class task6 {
    public static void main(String[] args) {

        try {
            // مثال يسبب NullPointerException
            String text = null;
            int length = text.length();   // هنا هيحصل NullPointerException

            // مثال يسبب ArithmeticException
            int num = 10 / 0;  // هنا هيحصل ArithmeticException

        } catch (NullPointerException e) {
            System.out.println("Error: You tried to use a null object!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
