package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BiudzetApplication {

    private final ConsoleMenu mainMenu;
    private Biudzetas biudzetas;

    Scanner sc = new Scanner(System.in);


    public BiudzetApplication() {
        this.mainMenu = new Menu();
    }

    public void run() throws IOException {
        mainMenu.printMenu();

        String value = "";

        while (!value.equals("5")) {
            value = mainMenu.readInput();
            switch (value) {
                case "1":
                    System.out.println("iveskite suma:");
                    int suma = sc.nextInt();
                    System.out.println("iveskite indeksa");
                    int indeksas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("pervesta i banka:");
                    String arIbanka = sc.nextLine();
                    System.out.println("iveskite info:");
                    String info = sc.nextLine();
                    biudzetas.pridetiPajamuIsrasa(new PajamuIrasas(suma, indeksas, arIbanka, info));
                    System.out.println("Pajamos pridetos");
                    break;
                case "2":
                    System.out.println("iveskite suma:");
                    suma = sc.nextInt();
                    System.out.println("iveskite indeksa");
                    indeksas = sc.nextInt();
                    System.out.println("nurodykite buda: ");
                    String budas = sc.nextLine();
                    System.out.println("iveskite kortele:");
                    String kortele = sc.nextLine();
                    biudzetas.pridetislaiduIsrasa(new IslaiduIrasas(suma, indeksas, budas, kortele));
                    break;
                case "3":

                    break;
                case "4":
                    break;
                default:
                    System.out.println("bloga ivestis");
                    break;

            }
        }

    }
}
