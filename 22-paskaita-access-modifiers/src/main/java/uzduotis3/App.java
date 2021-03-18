package uzduotis3;

public class App {

    public static void main(String[] args) {

        Skaitliukas skaitliukas = new Skaitliukas("20190206");
        AsmensKodoGeneratorius kodas = new AsmensKodoGeneratorius(skaitliukas);
        kodas.generuoti();

    }
}
