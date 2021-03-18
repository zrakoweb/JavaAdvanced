package uzduotis3;

public class AsmensKodoGeneratorius {
    static Skaitliukas skaitliukas;

    public AsmensKodoGeneratorius(Skaitliukas skaitliukas) {
        this.skaitliukas = skaitliukas;
    }

    public void generuoti(){
        skaitliukas.didintiVienetu();
        skaitliukas.getN();
    }
}
