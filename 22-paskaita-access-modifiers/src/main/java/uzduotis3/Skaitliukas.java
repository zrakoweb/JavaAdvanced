package uzduotis3;

public class Skaitliukas {
    private final String n;

    public Skaitliukas(String n) {
        this.n = n;
    }

    int didintiVienetu(){
      int naujas = Integer.parseInt(n)+1;
      return naujas;
    }

    public String getN() {
        return n;
    }

    String nustatytiNumatytaReiksme(){
        return n;
    }

}
