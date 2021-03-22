package uzduotis1papildoma;

import java.io.*;

public class Nuskaitymas {

    public static void main(String[] args) throws IOException {

        File failas = new File("src/main/java/uzduotis1papildoma/people.txt");
        readFile(failas);
    }

    private static void readFile(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }

}
