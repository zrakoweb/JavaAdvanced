package org.example;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
//        Integer skaiciai [] = {1,2,3};
//        String zodziai [] = {"labas", "hello"};

        List<Medis> sarasas = new ArrayList<>();
        List<Spygliuotis> spygliuotis = new ArrayList<>();
        List<Berzas> berzas = new ArrayList<>();



        Medis m1 = new Azuolas();
        Medis m2 = new Egle();
        Medis m3 = new Azuolas();
        Medis m4 = new Berzas();
        Medis m5 = new Kadagys();
        Medis m6 = new Pusis();

        spygliuotis.add((Spygliuotis) m2);
        spygliuotis.add((Spygliuotis) m5);
        spygliuotis.add((Spygliuotis) m6);


        sarasas.add(m1);
        sarasas.add(m2);
        sarasas.add(m3);
        sarasas.add(m4);
        sarasas.add(m5);
        sarasas.add(m6);

        Metodai metodai = new Metodai();
        metodai.ivairusMiskas(sarasas);
        System.out.println("-------------");
        metodai.spigliuociuMiskas(spygliuotis);
        System.out.println("-------------------");
        metodai.ivairusMiskas(spygliuotis);




    }

//    private static <E> void printArray(E[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//    }
}
