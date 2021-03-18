package uzduotis2;

import java.util.List;

public class PvmValidatorius {


    boolean tikrintiPVMkoda(String numeris) {
        int[] skaiciai = new int[9];

        for (int i = 0; i < 9; i++) {
            skaiciai[i] = numeris.charAt(i) - '0';
        }
        if (skaiciai[7] != 1) return false;

        int c9, r1, r2;
        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < 8; i++) {
            a1 += skaiciai[i] * (i + 1);
        }
        r1 = a1 % 11;
        if (r1 != 10) {
            c9 = r1;
        } else {
            for (int i = 0, j = 3; i < 8; i++, j++) {
                a2 += skaiciai[i] * ((j - 1) % 9 + 1);
            }
            r2 = a2 % 11;
            if (r2 == 10) {
                c9 = 0;
            } else {
                c9 = r2;
            }
        }
        if (c9 == skaiciai[8]) {
            return true;
        }else{
            return false;
        }
    }
}
