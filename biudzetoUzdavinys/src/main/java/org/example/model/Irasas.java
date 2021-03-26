package org.example.model;

import java.time.LocalDateTime;

public class Irasas {

    private int suma;
    private int indeksas;
    private LocalDateTime data;

    public Irasas(int suma, int indeksas,) {
        this.suma = suma;
        this.indeksas = indeksas;
        this.data = LocalDateTime.now();
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
}
