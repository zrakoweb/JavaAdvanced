package uzduotis2;

import java.util.Comparator;

public class YSarasoRusiavimas implements Comparator<X> {


    @Override
    public int compare(X o1, X o2) {
        return o1.gautiSuma() - o2.gautiSuma();
    }
}
