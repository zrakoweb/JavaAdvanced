package com.paveldejimas;

import java.util.Random;

abstract class Skaicius {

    Random rand = new Random();
    int min = 20;
    int max = 200;
    int atsitiktinisSkaicius = rand.nextInt((max - min) + 1) +min;
    protected int [] skaiciai = new int [atsitiktinisSkaicius];

    public abstract void generuok();

    public int suma(int [] skaiciai){
        int suma = 0;
        for(int i = 0; i < skaiciai.length; i++) {
            suma += skaiciai[i];
        }
        System.out.println("skaiciu suma: " + suma);
        return suma;
    }

}
