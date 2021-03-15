package org.example.darbuotojai;

public abstract class Developer implements Darbuotojas {

    private String vardas;
    private Pareigos pareigos;

    public Developer(String vardas, Pareigos pareigos) {
        this.vardas = vardas;
        this.pareigos = pareigos;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public Pareigos getPareigos() {
        return pareigos;
    }

    public void setPareigos(Pareigos pareigos) {
        this.pareigos = pareigos;
    }
}
