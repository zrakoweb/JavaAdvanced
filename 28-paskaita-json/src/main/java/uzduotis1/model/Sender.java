package uzduotis1.model;

public class Sender extends Asmuo {

    private String emount;

    public Sender(){
    }
    public Sender(String name, String emount) {
        super(name);
        this.emount = emount;
    }
    public String getEmount() {
        return emount;
    }
    public void setEmount(String emount) {
        this.emount = emount;
    }


}
