package uzduotis2;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10);
        X x = new X();
        x.skaiciai.add(random.nextInt(10));
        x.skaiciai.add(random.nextInt(10));
        x.skaiciai.add(random.nextInt(10));
        X x1 = new X();
        System.out.println(x);
        x1.skaiciai.add(random.nextInt(10));
        x1.skaiciai.add(random.nextInt(10));
        x1.skaiciai.add(random.nextInt(10));
        X x2 = new X();
        System.out.println(x1);
        x2.skaiciai.add(random.nextInt(10));
        x2.skaiciai.add(random.nextInt(10));
        x2.skaiciai.add(random.nextInt(10));
        Y y = new Y();
        System.out.println(x2);
        y.sarasas.add(x);
        y.sarasas.add(x1);
        y.sarasas.add(x2);
        Collections.sort(y.sarasas, new YSarasoRusiavimas());
        System.out.println(y.sarasas);
        Collections.reverse(y.sarasas);
        System.out.println(y.sarasas);

    }
}


