package org.example.model;

import java.time.LocalDateTime;

public class IslaiduIrasas {

    private int suma;
    private int indeksas;
    private LocalDateTime data;
    private String budas;
    private String kortele;

    public IslaiduIrasas(int suma, int indeksas, String budas, String kortele) {
        this.suma = suma;
        this.indeksas = indeksas;
        this.data = LocalDateTime.now();
        this.budas = budas;
        this.kortele = kortele;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getIndeksas() {
        return indeksas;
    }

    public void setIndeksas(int indeksas) {
        this.indeksas = indeksas;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
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
                "suma=" + suma +
                ", indeksas=" + indeksas +
                ", data=" + data +
                ", budas='" + budas + '\'' +
                ", kortele='" + kortele + '\'' +
                '}';
    }
}