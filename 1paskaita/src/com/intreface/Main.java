package com.intreface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jeep jeep = new Jeep(4, "Rav4", 5, 180);
        Hovercraft hover = new Hovercraft(5,"LandAndSeaBroker", 8, 80, 5);
        Frigate friga = new Frigate("laisve", 15, 40, 2 );
        PoliceCar p1 = new PoliceCar();
        PoliceCar p2 = new PoliceCar();

        List <IsVehicle> kolekcija = new ArrayList();
        kolekcija.add(jeep);
        kolekcija.add(hover);
        kolekcija.add(friga);
        kolekcija.add(p1);
        kolekcija.add(p2);
        p1.drive();
        p2.soundSiren();
        for(IsVehicle list: kolekcija){
            if(list instanceof Jeep){
                ((Jeep) list).soundHorn();
            }else if (list instanceof Hovercraft){
                ((Hovercraft) list).enterLand();
                ((Hovercraft) list).enterSea();
            } else if (list instanceof Frigate){
                ((Frigate) list).fireGun();
            }
        }
    }
}
