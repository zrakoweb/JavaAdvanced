package uzduotis2;

import java.util.ArrayList;
import java.util.List;

public class Y{

    List<X> sarasas = new ArrayList<>();


    public List<X> getSarasas() {
        return sarasas;
    }

    @Override
    public String toString() {
        return "Y{" +
                "sarasas=" + sarasas +
                '}';
    }

    public void setSarasas(List<X> sarasas) {
        this.sarasas = sarasas;
    }
}
