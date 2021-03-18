package uzduotis3;

import uzduotis3.util.BadRequestHttpCode;
import uzduotis3.util.InternalServerErrorHttpCode;
import uzduotis3.util.NotFoundHttpCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<HttpErrorPair> list = new ArrayList<>();
        list.add(new HttpErrorPair(HttpCodeEnum.CODE_500, new InternalServerErrorHttpCode(ErrorLevels.HIGH)));
        list.add(new HttpErrorPair(HttpCodeEnum.CODE_401, new BadRequestHttpCode(ErrorLevels.MEDIUM)));
        list.add(new HttpErrorPair(HttpCodeEnum.CODE_404, new NotFoundHttpCode(ErrorLevels.LOW)));
        list.add(new HttpErrorPair(HttpCodeEnum.CODE_525, new InternalServerErrorHttpCode(ErrorLevels.CRITICAL)));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
