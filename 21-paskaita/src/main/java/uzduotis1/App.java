package uzduotis1;

import uzduotis1.service.IdComparator;
import uzduotis1.service.PavardesComparator;
import uzduotis1.service.VardoComparator;

import java.util.Collections;


public class App {

    public static void main(String[] args) {
        JavaStudentGroup javaStudentGroup = new JavaStudentGroup();
        javaStudentGroup.studentai.add(new Student("Jonas", "jj", 9));
        javaStudentGroup.studentai.add(new Student("Petras", "qq", 11));
        javaStudentGroup.studentai.add(new Student("Karolis", "aa", 15));
        javaStudentGroup.studentai.add(new Student("Mantas", "ee", 5));
        javaStudentGroup.studentai.add(new Student("Bobas", "rr", 4));
        javaStudentGroup.studentai.add(new Student("Arvydas", "vv", 14));
        javaStudentGroup.studentai.add(new Student("Jokubas", "bb", 7));
        javaStudentGroup.studentai.add(new Student("Aleksandras", "cc", 8));
        javaStudentGroup.studentai.add(new Student("Aidas", "xx", 1));
        javaStudentGroup.studentai.add(new Student("Egle", "zz", 13));
        javaStudentGroup.studentai.add(new Student("Eva", "pp", 2));
        javaStudentGroup.studentai.add(new Student("Karolina", "ll", 12));
        javaStudentGroup.studentai.add(new Student("Gabriele", "aa", 10));
        javaStudentGroup.studentai.add(new Student("Ema", "ff", 6));
        javaStudentGroup.studentai.add(new Student("Evaldas", "zz", 3));


        Collections.sort(javaStudentGroup.studentai, new VardoComparator());
        System.out.println(javaStudentGroup.studentai);
        System.out.println("================================");
        Collections.sort(javaStudentGroup.studentai, new PavardesComparator());
        System.out.println(javaStudentGroup.studentai);
        System.out.println("==========================");
        Collections.sort(javaStudentGroup.studentai, new IdComparator());
        System.out.println(javaStudentGroup.studentai);
        System.out.println("=======================");


        


    }
}
