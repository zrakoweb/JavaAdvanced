package uzduotis1;

public class App {

    public static void main(String[] args) {
        Startup startup = new Startup();

        Starter starter = new Starter() {
            @Override
            public String start(String startupName, String founderName) {
                return startupName + "-" + founderName;
            }
        };

        System.out.println(starter.start("Jonas", "Karolis"));;
        starter.progress();
        System.out.println(Starter.finish());
    }

}
