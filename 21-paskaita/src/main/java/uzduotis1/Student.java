package uzduotis1;

public class Student  implements Comparable<Student>{

    private String vardas;
    private String pavarde;
    private int id;

    public Student(String vardas, String pavarde, int id) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.id = id;
    }

    public int compareTo(Student student){
        return this.getVardas().compareTo(student.getVardas());
    }


    @Override
    public String toString() {
        return '\n' + "Student{" +
                "vardas='" + vardas + '\'' + '\n'+
                ", pavarde='" + pavarde + '\'' +'\n'+
                ", id=" + id +'}';
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
