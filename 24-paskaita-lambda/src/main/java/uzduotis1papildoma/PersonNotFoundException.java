package uzduotis1papildoma;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException() {
        super("Person not found");
    }
}
