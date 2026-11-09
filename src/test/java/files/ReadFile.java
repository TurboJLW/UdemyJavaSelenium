package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/test/resources/writeSomeText.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
