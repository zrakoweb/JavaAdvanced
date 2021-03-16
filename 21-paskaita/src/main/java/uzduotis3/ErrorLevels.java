package uzduotis3;

public enum ErrorLevels{

    HIGH (2),
    LOW (0),
    MEDIUM (1),
    CRITICAL (3);

    private int value;

    ErrorLevels(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ErrorLevels{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }
}
