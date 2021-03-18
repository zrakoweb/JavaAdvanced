package uzduotis1.a;

import uzduotis1.a.A;
import uzduotis1.b.B;
import uzduotis1.b.C;
import uzduotis1.b.D;

public class App {

    public static void main(String[] args) {


        D d = new D();
        B b = new B();
        C c = new C();
        A a = new A();
        c.z();
        b.z();
        b.callX();
        d.callBy();
        a.callBW();
    }
}
