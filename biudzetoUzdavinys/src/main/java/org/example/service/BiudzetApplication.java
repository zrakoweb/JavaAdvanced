package org.example.service;

import org.example.model.IslaiduIrasas;
import org.example.model.Menu;
import org.example.model.PajamuIrasas;
import org.example.service.Biudzetas;
import org.example.util.ConsoleMenu;

import java.io.IOException;
import java.util.Scanner;

public class BiudzetApplication {

    private final ConsoleMenu mainMenu;
    private final Biudzetas biudzetas = new Biudzetas();

    Scanner sc = new Scanner(System.in);


    public BiudzetApplication() {
        this.mainMenu = new Menu();
    }

    public void run() throws IOException {

        String value = "";

        while (!value.equals("5")) {
            mainMenu.printMenu();
            value = mainMenu.readInput();
            switch (value) {
                case "1":
                    System.out.println("iveskite suma:");
                    int suma = sc.nextInt();
                    sc.nextLine();
                    System.out.println("iveskite indeksa");
                    int indeksas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("pervesta i banka:");
                    String arIbanka = sc.nextLine();
                    System.out.println("iveskite info:");
                    String info = sc.nextLine();
                    PajamuIrasas irasas = new PajamuIrasas(suma, indeksas, arIbanka, info);
                    biudzetas.pridetiPajamuIsrasa(irasas);
                    System.out.println("Pajamos pridetos");
                    break;
                case "2":
                    System.out.println("iveskite suma:");
                    suma = sc.nextInt();
                    sc.nextLine();
                    System.out.println("iveskite indeksa");
                    indeksas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nurodykite buda: ");
                    String budas = sc.nextLine();
                    System.out.println("iveskite kortele:");
                    String kortele = sc.nextLine();
                    biudzetas.pridetislaiduIsrasa(new IslaiduIrasas(suma, indeksas, budas, kortele));
                    System.out.println("islaidos pridetos");
                    break;
                case "3":
                    System.out.println("gauta pajamu: ");
                    biudzetas.gautiPajamuSuma();

                    break;
                case "4":
                    System.out.println("isleista pinigu: ");
                    biudzetas.gautiIslaiduSuma();
                    break;
                default:
                    System.out.println("bloga ivestis");
                    break;

            }
        }

    }
}
