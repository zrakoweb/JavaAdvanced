package uzduotis2;

@FunctionalInterface
public interface Starter {

    String start(String startupName, String founderName);

    default void progress (){
        System.out.println("in progres");
    }

    static String finish(){
        return "Startup sold";
    }

}
