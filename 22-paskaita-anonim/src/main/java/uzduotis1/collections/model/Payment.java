package uzduotis1.collections.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Payment {



    private final int id = new Random().nextInt(10);
    private final String name;
    private final LocalDate date;
    private final int recipientId;
    private final int payerid;
    private static List<Payment> list = new ArrayList<>();

    public Payment(String name, int recipientId, int payerid) {
        this.name = name;
        this.date = LocalDate.now();
        this.recipientId = recipientId;
        this.payerid = payerid;
    }

    public static List<Payment> paymentNumberGenerator(int skaicius) {
        for(int i = 0; i < skaicius; i++){
            list.add(new Payment(null, 0,0));
        }
            return list;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public int getPayerid() {
        return payerid;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", recipientId=" + recipientId +
                ", payerid=" + payerid +
                '}';
    }
}
