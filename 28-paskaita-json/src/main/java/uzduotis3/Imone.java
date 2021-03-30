package uzduotis3;

public class Imone {

    private String pavadinimas;
    private int imonesKodas;
    private int darbuotojuSkaicius;
    private int vidutinisAtlyginimas;

    public Imone(String pavadinimas, int imonesKodas, int darbuotojuSkaicius, int vidutinisAtlyginimas) {
        this.pavadinimas = pavadinimas;
        this.imonesKodas = imonesKodas;
        this.darbuotojuSkaicius = darbuotojuSkaicius;
        this.vidutinisAtlyginimas = vidutinisAtlyginimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getImonesKodas() {
        return imonesKodas;
    }

    public void setImonesKodas(int imonesKodas) {
        this.imonesKodas = imonesKodas;
    }

    public int getDarbuotojuSkaicius() {
        return darbuotojuSkaicius;
    }

    public void setDarbuotojuSkaicius(int darbuotojuSkaicius) {
        this.darbuotojuSkaicius = darbuotojuSkaicius;
    }

    public int getVidutinisAtlyginimas() {
        return vidutinisAtlyginimas;
    }

    public void setVidutinisAtlyginimas(int vidutinisAtlyginimas) {
        this.vidutinisAtlyginimas = vidutinisAtlyginimas;
    }
}
