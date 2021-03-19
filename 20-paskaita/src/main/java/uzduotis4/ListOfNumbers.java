package uzduotis4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {


    List<Double> skaiciai = new ArrayList<>();



    public void addNumber(Double skaicius){

        skaiciai.add(skaicius);
    }

    public Double getAverage(){
        int counter = 0;
        Double suma = 0d;
        for(Double i: skaiciai){
            suma += i;
            counter++;
        }
        return suma/counter;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "skaiciai=" + skaiciai +
                '}';
    }
}
