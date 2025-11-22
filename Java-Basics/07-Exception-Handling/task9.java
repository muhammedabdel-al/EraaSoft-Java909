public class task9 {

    // دالة ترمي Exception
    public static void riskyMethod() throws Exception {
        System.out.println("Inside riskyMethod");
        throw new Exception("Something went wrong in riskyMethod!");
    }

    // دالة تستدعي riskyMethod
    public static void callMethod() throws Exception {
        System.out.println("Inside callMethod");
        riskyMethod(); // هنا هتتدفق الـ Exception للفوق
    }

    public static void main(String[] args) {

        try {
            callMethod(); // استدعاء الدالة اللي فيها exception
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
