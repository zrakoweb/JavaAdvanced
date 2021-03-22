package org.example;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        Biudzetas b1 = new Biudzetas();
        PajamuIrasas pi1 = new PajamuIrasas(1, 2, true, "aa");
        IslaiduIrasas ii1 = new IslaiduIrasas(2, 3, "bb", "cc");
        new BiudzetApplication().run();
        System.out.println(pi1);
        System.out.println(ii1);


    }
}
