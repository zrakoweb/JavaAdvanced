package uzduotis4;

import java.util.ArrayList;
import java.util.List;

public class MaxAverage {



    public static ListOfNumbers findWithMaxAverage(List< ListOfNumbers> listObject){
        double max = 0;

        for(ListOfNumbers listas: listObject ){
            if(max<listas.getAverage()){
                max= listas.getAverage();

            }return listas;
        }return null;
    }
}
