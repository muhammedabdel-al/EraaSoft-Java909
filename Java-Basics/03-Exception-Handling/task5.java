import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = input.nextLine();

        try {

            File file = new File(path);
            Scanner reader = new Scanner(file);

            System.out.println("File content:");


            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error: File not found! Make sure the path is correct.");
        }

        input.close();
    }
}
