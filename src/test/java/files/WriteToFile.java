package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/test/resources/writeSomeText.txt");
        fileWriter.write("text to writewrite");
        fileWriter.close();
    }

}
