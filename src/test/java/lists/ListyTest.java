package lists;

import java.util.ArrayList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Grzesiu");
        names.add("Kasia");
        names.add("Ola");

        System.out.println(names.get(0));

        System.out.println(names.indexOf("Kasia"));
        System.out.println(names.lastIndexOf("Ola"));
        System.out.println(names.contains("Paweł"));

    }
}
