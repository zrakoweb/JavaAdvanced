package org.example.model;

import java.time.LocalDateTime;

public class PajamuIrasas extends Irasas {


    private String arIbanka;
    private String info;

    public PajamuIrasas(int suma, int indeksas, String arIbanka, String info) {
        super(suma, indeksas);
        this.arIbanka = arIbanka;
        this.info = info;
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

                ", arIbanka=" + arIbanka +
                ", info='" + info + '\'' +
                '}';
    }
}
