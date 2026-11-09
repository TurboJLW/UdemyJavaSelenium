package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fileToDelete = new File("src/test/resources/text.txt");
        if(fileToDelete.delete()) {
            System.out.println("Plik został usunięty");
        } else {
            System.out.println("Nie udało się usunąć pliku");
        }
    }
}
