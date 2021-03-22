package uzduotis1;

public class Startup implements Starter {
    @Override
    public String start(String startupName, String founderName) {
        return startupName + "-" + founderName;
    }

    @Override
    public void progress() {
        System.out.println("in progress startup");
    }
}
