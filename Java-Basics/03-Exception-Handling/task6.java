public class task6 {
    public static void main(String[] args) {

        try {

            String text = null;
            int length = text.length();


            int num = 10 / 0;

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
