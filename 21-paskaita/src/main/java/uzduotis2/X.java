package uzduotis2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class X {
    List<Integer> skaiciai = new ArrayList<>();

    public int gautiSuma(){

        int suma = 0;
        for(Integer i : skaiciai){
            suma = suma + i;
        }return suma;
    }

    @Override
    public String toString() {
        return "X{" +
                "skaiciai=" + skaiciai +
                '}';
    }

    public void pridetiSkaiciu(int rand){
        skaiciai.add(rand);
    }

    public List<Integer> getSkaiciai() {
        return skaiciai;
    }

    public void setSkaiciai(List<Integer> skaiciai) {
        this.skaiciai = skaiciai;
    }
}
