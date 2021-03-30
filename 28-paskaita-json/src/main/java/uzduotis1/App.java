package uzduotis1;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import uzduotis1.model.Payment;
import uzduotis1.model.Receiver;
import uzduotis1.model.Sender;
import uzduotis1.service.ObjectSerializer;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Payment.class, new ObjectSerializer());

        Payment payment = new Payment(new Sender("John", "100"), new Receiver("Paul", "EN55462121"));
        File objectJson = new File("objectJson.json");
        mapper.writeValue(objectJson, payment);
        Payment infoFromFile = mapper.readValue(objectJson, Payment.class);
        System.out.println(infoFromFile);
    }
}
