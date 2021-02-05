import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

class wiki {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream

        if (args.length > 0) {
            String query = args[0];
            String filename = args[1];
            File file = new File(filename);
            file.createNewFile();
            String textToAppend = "https://en.wikipedia.org/wiki/" + query + "'\n'";
            Path path = Paths.get(filename);
            Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);

        } else {
            System.out.println("Enter Search String");
            String query = sc.nextLine();
            System.out.println("Enter File Name");
            String filename = sc.nextLine();
            File file = new File(filename);

            String textToAppend = "https://en.wikipedia.org/wiki/" + query + "'\n'";
            Path path = Paths.get(filename);

            Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
        }
    }
}
