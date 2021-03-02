package com.paveldejimas;

public class NeigiamiSkaiciai extends Skaicius {
    @Override
    public void generuok() {
        for(int i = 0; i < skaiciai.length; i++){
            skaiciai[i] = rand.nextInt(100) * (-1);
            System.out.println(skaiciai[i]);
        }
    }
}
