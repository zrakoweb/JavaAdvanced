package uzduotis1.model;

import uzduotis1.model.Asmuo;

public class Receiver extends Asmuo {

    private String accountNumber;

    public Receiver(){
    }
    public Receiver(String name, String accountNumber) {
        super(name);
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
