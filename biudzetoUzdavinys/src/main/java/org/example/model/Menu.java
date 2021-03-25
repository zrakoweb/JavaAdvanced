package org.example.model;

import org.example.util.ConsoleMenu;

public class Menu implements ConsoleMenu {
    private static final String MENIU_TEXT =
    "\n" +
            "pasirinkite ka norite daryti:\n" +
            "1.prideti pajamas\n" +
            "2.prideto islaidas\n" +
            "3.gauti visas pajamas\n" +
            "4.gauti visas islaidas\n";

    public void printMenu(){
        System.out.println(MENIU_TEXT);
        }

}
