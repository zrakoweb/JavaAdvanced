package uzduotis2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {


    public static void main(String[] args) {

        List<String>persons = new ArrayList<>();
        try (InputStream in = new FileInputStream(new File("C:\\Users\\User\\Desktop\\JavaAdvanced\\25-paskaita-streams\\src\\main\\java\\uzduotis2\\people.txt"))) {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            persons = br.lines()
                    .skip(1)
                    .map(line -> line.split(", ")[1])
                    .collect(Collectors.toList());
            System.out.print(persons);
            System.out.println();

            List<String> uniqueNames = persons.stream()
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println(uniqueNames);

            List <String> sortedName = persons.stream()
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(sortedName);







        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
