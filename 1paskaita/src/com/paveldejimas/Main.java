package com.paveldejimas;

public class Main {

    public static void main(String[] args){
        Skaicius sk = new TeigiamasSkaicius();
        Skaicius sk1 = new LyginisSkaicius();
        Skaicius sk2 = new NelyginisSkaicius();
        Skaicius sk3 = new NeigiamiSkaiciai();
        run(sk);
        run(sk1);
        run(sk2);
        run(sk3);

    }
    static void run (Skaicius skaicius){
        skaicius.generuok();
        skaicius.suma(skaicius.skaiciai);
    }

}
