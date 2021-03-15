package com.downcastUzdavinys;

public class App {

    public static void main(String[] args) {
        Draudimas dr1 = new TPVCADraudimas("Jonas", 100,"AAA111", "Lietuva");
        Draudimas dr2 = new KaskoDraudimas("Petras", 150,"BBB222", 500);

        AutomobilioDraudimas naujas1 = (AutomobilioDraudimas) dr1;
        AutomobilioDraudimas naujas2 = (AutomobilioDraudimas) dr2;

        TPVCADraudimas kitas1 = (TPVCADraudimas) naujas1;
        KaskoDraudimas kitas2 = (KaskoDraudimas) naujas2;

        System.out.println("vardas " + dr1.getApdraustojoVardas() + "antra vardas" + dr2.getApdraustojoVardas());
        System.out.println("suma: " + dr1.getDraudimoSuma() + " " + dr2.getDraudimoSuma());
        System.out.println(naujas1.getAutomobilioValstNr());
        System.out.println(naujas2.getAutomobilioValstNr());
        System.out.println(kitas1.getGaliojimoTeritorija());
        System.out.println(kitas2.getFransize());


        AutomobilioDraudimas auto = new AutomobilioDraudimas("Karolis", 500, "CCC333");
        TPVCADraudimas autoT = (TPVCADraudimas) auto;
        KaskoDraudimas autoK = (KaskoDraudimas) auto;

    }
}
