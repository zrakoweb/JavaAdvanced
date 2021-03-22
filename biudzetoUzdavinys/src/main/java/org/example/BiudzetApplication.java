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
                    System.out.println("pervesta i banka?");
                    boolean arIbanka = sc.nextBoolean();
                    System.out.println("iveskite info:");
                    String info = sc.nextLine();
                    biudzetas.pridetiPajamuIsrasa(new PajamuIrasas(suma, indeksas, arIbanka, info));
                    break;
                case "2":

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
