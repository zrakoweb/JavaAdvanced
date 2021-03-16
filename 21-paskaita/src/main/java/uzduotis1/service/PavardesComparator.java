package uzduotis1.service;

import uzduotis1.Student;

import java.util.Comparator;

public class PavardesComparator implements Comparator<Student> {
    @Override

    public int compare(Student o1, Student o2) {
        return o1.getPavarde().compareTo(o2.getPavarde());
    }
}
