package uzduotis1.model;

import uzduotis1.model.Receiver;
import uzduotis1.model.Sender;

public class Payment {

    private Sender sender;
    private Receiver receiver;
    
    Payment(){
    }
    public Payment(Sender sender, Receiver receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }
    public Sender getSender() {
        return sender;
    }
    public void setSender(Sender sender) {
        this.sender = sender;
    }
    public Receiver getReceiver() {
        return receiver;
    }
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public String toString() {
        return "Payment{" +
                " sender Name=" + sender.getName() +
                " amount=" + sender.getEmount() +
                ", receiver Name=" + receiver.getName() +
                " account number=" + receiver.getAccountNumber() +
                '}';
    }
}
