package com.company;

public class Main {
    public static void main(String[] args) {
        Miestas miestas = new Miestas("Vilnius");
        Adresas adresas = new Adresas(miestas);
        System.out.println(gautiMiestoPavadinima(adresas));

    }
    public static String gautiMiestoPavadinima(Adresas adresas) {
        if (adresas != null) {
            Miestas miestas = adresas.getMiestas();
            if (miestas != null) {
                return miestas.getPavadinimas();
            }
        }
        return null;
    }
}
