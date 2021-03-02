package com.paveldejimas;

public class NelyginisSkaicius extends Skaicius {
    @Override
    public void generuok() {
        for(int i = 0; i < skaiciai.length; i++){
            skaiciai[i] = rand.nextInt(100)*2 + 1;
            System.out.println(skaiciai[i]);
        }
    }
}
