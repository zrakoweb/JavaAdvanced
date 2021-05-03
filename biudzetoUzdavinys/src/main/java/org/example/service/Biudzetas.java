package org.example.service;

import org.example.model.Irasas;
import org.example.model.IslaiduIrasas;
import org.example.model.PajamuIrasas;

import java.util.ArrayList;
import java.util.List;

public class Biudzetas {

    private ArrayList<Irasas> irasas;
    private ArrayList<PajamuIrasas> pajamos;
    private ArrayList<IslaiduIrasas> islaidos;

    static int count = 0;
    private int id;

    public Biudzetas() {
        irasas = new ArrayList<>();
        pajamos = new ArrayList<>();
        islaidos = new ArrayList<>();
    }

    public void pridetiPajamuIsrasa(PajamuIrasas pajamuIrasas) {
        pajamos.add(pajamuIrasas);
    }

    public void pridetislaiduIsrasa(IslaiduIrasas islaiduIrasas) {
        islaidos.add(islaiduIrasas);
    }

    public List<Irasas> getIrasas() {
        return irasas;
    }

    public void pridetiIslaiduIrasa(Irasas irasas) {

    }

    public float gautiBalansa() {
        float balansas = 0f;
        int islaiduSuma = gautiIslaiduSuma();
        int pajamuSuma = gautiPajamuSuma();
        balansas = (float) pajamuSuma - (float) islaiduSuma;
        return balansas;
    }

    public int gautiPajamuSuma() {
        int pajamuSuma = 0;
        for (PajamuIrasas pajamuIrasas : pajamos) {
            pajamuSuma += pajamuIrasas.getSuma();
        }
        return pajamuSuma;
    }

    public int gautiIslaiduSuma() {
        int islaiduSuma = 0;
        for (IslaiduIrasas islaiduIrasas : islaidos) {
            islaiduSuma += islaiduIrasas.getSuma();
        }
        return islaiduSuma;
    }

    public ArrayList<PajamuIrasas> gautiPajamuIrasa() {
        return pajamos;
    }

    public ArrayList<IslaiduIrasas> gautiIslaiduIrasa() {
        return islaidos;
    }

    public ArrayList<Irasas> gautiIrasa() {
        return irasas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
