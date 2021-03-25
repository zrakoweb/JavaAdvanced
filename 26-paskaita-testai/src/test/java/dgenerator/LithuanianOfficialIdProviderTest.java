package dgenerator;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class LithuanianOfficialIdProviderTest {


    @Test
    public void generateOfficialId_returnTrue() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        Person person = new Person("Petras", LocalDate.of(1987, Month.MAY, 11), Gender.MALE);

        //when
        String personalCode = provider.generateOfficialId(person);
        //then
        assertEquals("38705110001", personalCode);
    }

    @Test
    public void generateOfficialId_returnTrueTest2() {
        //given
        OfficialIdProvider provider = new LithuanianOfficialIdProvider();
        Person person = new Person("Jonas", LocalDate.of(1990, Month.SEPTEMBER, 01), Gender.MALE);
        Person person1 = new Person("Paulius", LocalDate.of(1990, Month.SEPTEMBER, 01), Gender.MALE);
        Person person2 = new Person("Karolis", LocalDate.of(1990, Month.SEPTEMBER, 01), Gender.MALE);
        Person person3 = new Person("Eva", LocalDate.of(2001, Month.SEPTEMBER, 22), Gender.FEMALE);
        Person person4 = new Person("Egle", LocalDate.of(2001, Month.SEPTEMBER, 22), Gender.FEMALE);
        Person person5 = new Person("Ana", LocalDate.of(2001, Month.SEPTEMBER, 22), Gender.FEMALE);

        //when
        String personalCode = provider.generateOfficialId(person);
        String personalCode1 = provider.generateOfficialId(person1);
        String personalCode2 = provider.generateOfficialId(person2);

        String personalCode3 = provider.generateOfficialId(person3);
        String personalCode4 = provider.generateOfficialId(person4);
        String personalCode5 = provider.generateOfficialId(person5);
        //then
        assertEquals("39009010007", personalCode);
        assertEquals("39009010018", personalCode1);
        assertEquals("39009010029", personalCode2);


        assertEquals("40109220034", personalCode3);
        assertEquals("40109220045", personalCode4);
        assertEquals("40109220056", personalCode5);
    }
}
