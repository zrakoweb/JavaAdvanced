package dgenerator;

import java.util.Calendar;

public class LithuanianOfficialIdProvider implements OfficialIdProvider{


    private String addControlValue(String kod) {
        int[] sk = new int[11];
        int s = 0;
        for (int i = 0; i < 10; i++) {
            try {
                sk[i] = Integer.parseInt(kod.substring(i, i + 1));
                s += sk[i] * (sk[i] == 9? 1: i + 1);
            } catch (NumberFormatException e) {
                System.exit(-1);
            }
        }

        if (s % 11 != 10) return kod + (s % 11);
        else {
            s = sk[0] * 3 + sk[1] * 4 + sk[2] * 5 + sk[3] * 6 + sk[4] * 7 + sk[5] * 8 + sk[6] * 9 + sk[7] + sk[8] * 2 + sk[9] * 3;
            if (s % 11 == 10) return kod + "0";
            else return kod + (s % 11);
        }
    }

    @Override
    public String generateOfficialId(Person person) {
        return null;
    }
}
