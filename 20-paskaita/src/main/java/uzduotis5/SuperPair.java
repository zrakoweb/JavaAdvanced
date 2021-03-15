package uzduotis5;

public class SuperPair<T1, T2, T3 extends Number> {

    private T1 vardas;
    private T2 pavarde;
    private T3 skaicius;

    public SuperPair(T1 vardas, T2 pavarde, T3 skaicius){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.skaicius = skaicius;
    }

}
