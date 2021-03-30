package uzduotis1.service;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import uzduotis1.model.Payment;

import java.io.IOException;

public class ObjectSerializer extends StdSerializer<Payment> {

    public ObjectSerializer(){
        this(null);
    }
    protected ObjectSerializer(Class<Payment> t) {
        super(t);
    }

    @Override
    public void serialize(Payment payment, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("Sender name: ", payment.getSender().getName());
        jsonGenerator.writeStringField("Amount: ", payment.getSender().getEmount());
        jsonGenerator.writeStringField("Receiver: ", payment.getReceiver().getName());
        jsonGenerator.writeStringField("Account: ", payment.getReceiver().getAccountNumber());
        jsonGenerator.writeEndObject();
    }
}
