package uzduotis3;

import java.util.Comparator;

public class HttpCode implements Comparable<HttpCode>{

    private ErrorLevels errorLevels;

    public HttpCode(ErrorLevels errorLevels) {
        this.errorLevels = errorLevels;
    }

    public ErrorLevels getErrorLevels() {
        return errorLevels;
    }

    @Override
    public String toString() {
        return "HttpCode{" +"level=" + errorLevels+'}';
    }


    @Override
    public int compareTo(HttpCode p) {
        return Integer.compare(this.errorLevels.getValue(), p.getErrorLevels().getValue());
    }
}
