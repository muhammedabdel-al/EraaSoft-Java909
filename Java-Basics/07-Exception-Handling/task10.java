import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class task10 {

    // دالة ترمي IOException
    public static void readFile(String path) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            throw new IOException("File does not exist!");
        }

        Scanner reader = new Scanner(file);
        System.out.println("File content:");

        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }

        reader.close();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = input.nextLine();

        try {
            readFile(path);  // استدعاء الدالة اللي فيها throws
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
        System.out.println("Program continues...");
    }
}
