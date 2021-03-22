package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Biudzetas b1 = new Biudzetas();
        PajamuIrasas pi1 = new PajamuIrasas(1,2,true, "aa");
        IslaiduIrasas ii1 = new IslaiduIrasas(2,3,"bb","cc");
        b1.pridetiPajamuIsrasa(pi1);
        b1.pridetislaiduIsrasa(ii1);
        System.out.println(pi1);
        System.out.println(ii1);


    }
}
