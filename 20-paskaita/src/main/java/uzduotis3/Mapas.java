package uzduotis3;

import java.util.ArrayList;
import java.util.List;

public class Mapas <K, V>  {

    List<Pora <K, V>> sarasasPoru = new ArrayList<>();


   void ideti(K raktas, V reiksme){
       Pora<K,V> pora = new Pora<K, V>(raktas, reiksme);
       sarasasPoru.add(pora);
   }
   V gauti(K rakta){
       V reik = null;
       for(Pora<K,V> i: sarasasPoru){
           if(i.getRaktas().equals(rakta)){
               reik =  i.getReiksme();
           }
       }return reik;
   }

}
