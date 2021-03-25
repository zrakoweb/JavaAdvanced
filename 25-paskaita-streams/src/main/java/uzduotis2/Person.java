package uzduotis2;

public class Person {

    private int id;
    private int name;
    private int surname;

    public Person(int id, int name, int surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getSurname() {
        return surname;
    }

    public void setSurname(int surname) {
        this.surname = surname;
    }
}
