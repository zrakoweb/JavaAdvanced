package org.example.model;

import java.time.LocalDateTime;

public class PajamuIrasas {

    private int suma;
    private int indeksas;
    private LocalDateTime data;
    private String arIbanka;
    private String info;

    public PajamuIrasas(int suma, int indeksas, String arIbanka, String info) {
        this.suma = suma;
        this.indeksas = indeksas;
        this.data = LocalDateTime.now();
        this.arIbanka = arIbanka;
        this.info = info;
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

    public String getArIbanka() {
        return arIbanka;
    }

    public void setArIbanka(String arIbanka) {
        this.arIbanka = arIbanka;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "suma=" + suma +
                ", indeksas=" + indeksas +
                ", data=" + data +
                ", arIbanka=" + arIbanka +
                ", info='" + info + '\'' +
                '}';
    }
}
