public class task9 {


    public static void riskyMethod() throws Exception {
        System.out.println("Inside riskyMethod");
        throw new Exception("Something went wrong in riskyMethod!");
    }


    public static void callMethod() throws Exception {
        System.out.println("Inside callMethod");
        riskyMethod();
    }

    public static void main(String[] args) {

        try {
            callMethod();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
