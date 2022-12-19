package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SampleProducer {
    public SampleProducer() {
        Properties props = new Properties();
        //Assign localhost id
        props.put("bootstrap.servers","localhost:9092");
        props.put("retries", 0);
        props.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = new KafkaProducer
                <String, String>(props);
        for(int i = 0; i < 10; i++)
            producer.send(new ProducerRecord<String, String>("first_kafka_topic",
                    Integer.toString(i), Integer.toString(i)));
        System.out.println("Message sent successfully");
        producer.close();
    }
}
