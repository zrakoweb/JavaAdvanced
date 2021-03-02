package com.paveldejimas;

public class TeigiamasSkaicius extends Skaicius {
    @Override
    public void generuok() {
        for(int i = 0; i < skaiciai.length; i++){
            skaiciai[i] = rand.nextInt(100);
            System.out.println(skaiciai[i]);
         }
    }
}
