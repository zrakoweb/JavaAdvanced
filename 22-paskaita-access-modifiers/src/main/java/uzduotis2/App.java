package uzduotis2;

public class App {
    public static void main(String[] args) {

        PvmValidatorius validator = new PvmValidatorius();
        System.out.println(validator.tikrintiPVMkoda("213179412"));
        System.out.println(validator.tikrintiPVMkoda("213179422"));
        PakeistasPVMValidatorius val = new PakeistasPVMValidatorius();
        System.out.println(val.tikrintiPVMkoda("213179412"));
        System.out.println(val.tikrintiPVMkoda("213179422"));
    }
}
