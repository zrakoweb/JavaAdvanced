package uzduotis1.service;

import uzduotis1.Student;

import java.util.Comparator;
import java.util.List;

public class VardoComparator implements Comparator<Student> {
//    @Override
//    public int compare(List<Student> studentai) {
//        for(Student student:studentai){
//
//        }
//    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getVardas().compareTo(o2.getVardas());
    }
}
