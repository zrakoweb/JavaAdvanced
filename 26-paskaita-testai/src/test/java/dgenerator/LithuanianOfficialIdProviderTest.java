package dgenerator;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class LithuanianOfficialIdProviderTest {


    @Test
    void generateOfficialId_returnTrue() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        Person person = new Person("Petras", LocalDate.of(1987, Month.MAY, 11), Gender.MALE);

        //when
        String personalCode = provider.generateOfficialId(person);
        //then
        assertEquals("38705110001", personalCode);
    }
}
