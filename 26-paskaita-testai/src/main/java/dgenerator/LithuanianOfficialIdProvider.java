package dgenerator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.stream.Stream;

public class LithuanianOfficialIdProvider implements OfficialIdProvider {


    private final String[] gender = {"3", "4"};
    private String addControlValue(String code) {
        int[] codeArr = Arrays.stream(code.split("")).mapToInt(Integer::parseInt).toArray();

        int controlValue = Stream.iterate(0, i -> ++i)
                .limit(10)
                .reduce(0, (total, idx) -> total += codeArr[idx] * (idx == 9 ? 1 : idx + 1));

        if (controlValue % 11 == 10) {
            controlValue = Stream.iterate(0, i -> ++i)
                    .limit(10)
                    .reduce(0, (total, idx) -> total += codeArr[idx] * (idx < 7 ? idx + 3 : idx - 6));
            if (controlValue % 11 == 10) {
                return code + "0";
            }
        }

        return code + (controlValue % 11);
    }

//            for (int i = 0, j = 3; i < 8; i++, j++) {
//                s += sk[i] * (i >= 7 ? i - 6 : i + 3);
//            }

//            List<Integer> orderTotals = Arrays.asList(99, 100, 200, 500);
//            int grandTotal = orderTotals.stream()
//                    .reduce(0, (total, number) -> total + number);

//                           s += sk[i] * ((j - 1) % 9 + 1);
//           s = sk[0] * 3 + sk[1] * 4 + sk[2] * 5 + sk[3] * 6 + sk[4] * 7 + sk[5] * 8 + sk[6] * 9 + sk[7] + sk[8] * 2 + sk[9] * 3;



    @Override
    public String generateOfficialId(Person person) {
        LocalDate date = person.getBirthDate();
        String datePart = String.format("%1$02d%2$02d%3$02d", date.getYear() % 100, date.getMonthValue(), date.getDayOfMonth());
        String personalCodePart = gender[person.getGender() == Gender.MALE ? 0 : 1] + datePart;
        String personalCode = personalCodePart + Counter.getNumber();
        personalCode = addControlValue(personalCode);
        Counter.increaseByOne();
        return personalCode;
    }
}
