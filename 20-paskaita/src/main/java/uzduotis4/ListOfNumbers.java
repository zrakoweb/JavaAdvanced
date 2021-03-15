package uzduotis4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {


    List<Double> skaiciai = new ArrayList<>();



    public void addNumber(Double skaicius){

        skaiciai.add(skaicius);
    }

    public double getAverage(){
        int vidurkis = 0;
        int suma = 0;
        for(Double i: skaiciai){
            suma += i;
            vidurkis = suma/skaiciai.size();
        }
        return vidurkis;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "skaiciai=" + skaiciai +
                '}';
    }
}
