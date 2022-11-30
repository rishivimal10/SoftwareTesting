import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the name you would like to search for: ");
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();

        List<String> lines = Files.readAllLines(Paths.get("src/demo.txt"));
        for (String line : lines) {
            if (line.contains(name)) {
                System.out.println(line);
            }
        }
    }
}