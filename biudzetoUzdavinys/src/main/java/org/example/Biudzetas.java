package org.example;

import java.util.Arrays;

public class Biudzetas {

    private PajamuIrasas[] pajamos;
    private IslaiduIrasas[] islaidos;

    public Biudzetas(){
        pajamos = new PajamuIrasas[100];
        islaidos = new IslaiduIrasas[100];
    }


    public void pridetiPajamuIsrasa(PajamuIrasas pajamuIrasas){
        for(int i = 0; i < pajamos.length; i++){
            if(pajamos[i].equals(null)){
                pajamos[i]=pajamuIrasas;
                break;
            }
        }
    }
    public void pridetislaiduIsrasa(IslaiduIrasas islaiduIrasas){
        for(int i = 0; i < islaidos.length; i++){
            if(islaidos[i].equals(null)){
                islaidos[i]=islaiduIrasas;
                break;
            }
        }
    }
    public int gautiBalansa(){
        int islaiduSuma = gautiIslaiduSuma();
        int pajamuSuma = gautiPajamuSuma();
        return  pajamuSuma - islaiduSuma;
    }

    private int gautiPajamuSuma(){
        int pajamuSuma = 0;
        for (PajamuIrasas pajamuIrasas:pajamos){
            pajamuSuma += pajamuIrasas.getSuma();
        }
        return pajamuSuma;
    }
    private int gautiIslaiduSuma(){
        int islaiduSuma =0;
        for(IslaiduIrasas islaiduIrasas: islaidos){
            islaiduSuma += islaiduIrasas.getSuma();
        }
        return islaiduSuma;
    }

    public PajamuIrasas[] gautiPajamuIrasa() {
        return pajamos;
    }

    public IslaiduIrasas[] gautiIslaiduIrasa() {
        return islaidos;
    }
}