import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length != 3) {
            System.out.println("need 3 arguments");
        } else if (!Objects.equals(args[0], "search")) {
            System.out.println("args should be formatted as 'search {pattern} {file}'");
        } else {

            List<String> lines = Files.readAllLines(Paths.get(args[2]));
            for (String line : lines) {
                if (line.contains(args[1])) {
                    System.out.println(line);
                }
            }
        }
    }
}