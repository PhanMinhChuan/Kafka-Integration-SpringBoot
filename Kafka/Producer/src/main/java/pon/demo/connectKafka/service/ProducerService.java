package pon.demo.connectKafka.service;

import jdk.nashorn.internal.parser.JSONParser;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pon.demo.connectKafka.model.Message;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("chuanpha")
                .partitions(10)
                .replicas(1)
                //.config(TopicConfig.RETENTION_MS_CONFIG, "1680000")
                .build();
    }

    public void produce(Message message) {
        System.out.println("Producing the message: " + message);
        kafkaTemplate.send("chuanpha", message);
    }

//    public void produceasda(Blog blog) {
//        //System.out.println("Producing the message: " + blog);
//        kafkaNew.send("messages","nameKey", blog);
//    }

//    public void produceNew(Message message) {
//        //System.out.println("Producing new message: " + message);
//        kafkaTemplate.send("new", "nameKey", message);
//    }
}
