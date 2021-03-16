package uzduotis3;

import java.util.Comparator;

public class HttpCode implements Comparator<ErrorLevels>{

    private ErrorLevels errorLevels;

    public ErrorLevels getErrorLevels() {
        return errorLevels;
    }

    @Override
    public String toString() {
        return "HttpCode{" +"level=" + errorLevels.values()+'}';
    }

    @Override
    public int compare(ErrorLevels o1, ErrorLevels o2) {
        return o1.getValue() - o2.getValue();
    }
}
