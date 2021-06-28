package pon.demo.connectKafka.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Service;
import pon.demo.connectKafka.model.Blog;
import pon.demo.connectKafka.model.Message;

@Service
public class ConsumerService {

    @KafkaListener(topics = "urlsCrawl", groupId = "minh_chuan")
    public void consumer1(Message message) {
        System.out.println("Consumer 1 listening: " + message);
    }

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consumer2(Message message) {
        System.out.println("Consumer 2 listening: " + message);
    }

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consumer3(Blog blog) {
        System.out.println("Consumer 3 listening: " + blog);
    }

    @KafkaListener(topics = "messages", id = "consumer_4")
    public void consumer4(Blog blog) {
        try {
            System.out.println("Consumer 4 listening: " + blog);
        } catch (Exception e) {
        }
    }

    @KafkaListener(topics = "messages", id = "consumer_5")
    public void consumer5(Message message) {
        System.out.println("Consumer 5 listening: " + message);
    }

    @KafkaListener(topics = "new", id = "consumer_6")
    public void consumer6(Message message) {
        System.out.println("Consumer 6 listening: " + message);
    }

    @KafkaListener(topics = "new", id = "consumer_7")
    public void consumer7(Message message) {
        System.out.println("Consumer 7 listening: " + message);
    }

    @KafkaListener(topics = "new", id = "consumer_8") //, topicPattern = "consumer_8", clientIdPrefix = "consumer_8", concurrency = "consumer_8", containerFactory = "consumer_8", containerGroup = "consumer_8"
    public void consumer8(Message message) {
        System.out.println("Consumer 8 listening: " + message);
    }

    @KafkaListener(topics = "new", id = "consumer_9")
    public void consumer9(Message message) {
        System.out.println("Consumer 9 listening: " + message);
    }

    @KafkaListener(topics = "new", id = "consumer_10")
    public void consumer10(Message message) {
        System.out.println("Consumer 10 listening: " + message);
    }
}
