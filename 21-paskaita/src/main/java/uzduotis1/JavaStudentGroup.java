package uzduotis1;

import java.util.ArrayList;
import java.util.List;

public class JavaStudentGroup {
    List<Student> studentai = new ArrayList<>();

    public List<Student> getStudentai() {
        return studentai;
    }

    public void setStudentai(List<Student> studentai) {
        this.studentai = studentai;
    }

    @Override
    public String toString() {
        return "JavaStudentGroup{" +
                "studentai=" + studentai +
                '}';
    }


}
