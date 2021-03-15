package org.example.darbuotojai;

public class Manager implements Darbuotojas {

    private String vardas;
    private Pareigos pareigos;
    int likeManager;

    public Manager(String vardas, Pareigos pareigos, int likeManager) {
        this.vardas = vardas;
        this.pareigos = pareigos;
        this.likeManager = likeManager;
    }

    @Override
    public int likeSkaiciuokle() {
        return 0;
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

    public int getLikeManager() {
        return likeManager;
    }

    public void setLikeManager(int likeManager) {
        this.likeManager = likeManager;
    }
}
