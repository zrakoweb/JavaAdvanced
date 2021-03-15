package org.example;

import java.util.List;

public class Metodai {

    public <T extends Medis> void ivairusMiskas(List<T> medziai){
        for(T t:medziai){
            t.turi();
        }
    }
    public <E extends Spygliuotis> void spigliuociuMiskas(List<E> spygliuotis){
        for(E e:spygliuotis){
            e.turi();
        }
    }

//    public void spigliuociuMiskas(<? extends Spygliuotis> spigliuotis){
//        * kitas budas
//    }
    public void berzuMiskas(List<Berzas> berzai){
        for(Berzas berzas:berzai){
            berzas.turi();
        }

    }

}
