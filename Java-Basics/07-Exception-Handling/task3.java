public class task3 {


    public static void printUpper(String text) {
        try {

            String upper = text.toUpperCase();
            System.out.println("Uppercase: " + upper);

        } catch (NullPointerException e) {

            System.out.println("Error: Cannot call toUpperCase() on null!");
        }
    }

    public static void main(String[] args) {


        String str = null;

        printUpper(str);
    }
}
