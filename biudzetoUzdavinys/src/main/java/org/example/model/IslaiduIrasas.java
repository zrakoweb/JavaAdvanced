package org.example.model;

import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas{


    private String budas;
    private String kortele;

    public IslaiduIrasas(int suma, int indekas, String budas, String kortele) {
        super(suma, indekas);
        this.budas = budas;
        this.kortele = kortele;
    }



    public String getBudas() {
        return budas;
    }

    public void setBudas(String budas) {
        this.budas = budas;
    }

    public String getKortele() {
        return kortele;
    }

    public void setKortele(String kortele) {
        this.kortele = kortele;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" +

                ", budas='" + budas + '\'' +
                ", kortele='" + kortele + '\'' +
                '}';
    }
}
