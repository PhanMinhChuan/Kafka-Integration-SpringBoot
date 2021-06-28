package pon.demo.connectKafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pon.demo.connectKafka.model.Message;

public class Listenning {

    @KafkaListener(topics = "haii", groupId = "group")
    public void listen1(Message message) {
        System.out.println(message);
    }
}