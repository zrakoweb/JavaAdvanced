package uzduotis3.util;

import uzduotis3.ErrorLevels;
import uzduotis3.HttpCode;

public class BadRequestHttpCode extends HttpCode {
    public BadRequestHttpCode(ErrorLevels medium) {
        super(medium);
    }
}
