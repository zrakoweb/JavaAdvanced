package uzduotis2;

public class App {

    public static void main(String[] args) {
        Starter starter = new Starter() {
            @Override
            public String start(String startupName, String founderName) {
                return startupName + "-" + founderName;
            }
        };
        System.out.println(starter.start("Nike", "Vladas"));
        starter.progress();
        System.out.println(Starter.finish());

        Starter starter1 = (String startupName, String founderName) -> startupName + "-" + founderName;
        Starter starter2 = (String startupName, String founderName) -> startupName + "-" + founderName;
        starter1.start("Mac", "Eva");
        starter1.progress();

    }
}
