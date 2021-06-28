package pon.demo.connectKafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pon.demo.connectKafka.model.Message;
import pon.demo.connectKafka.service.ProducerService;

import java.util.Random;

@RestController
public class ProduceController {

    @Autowired
    public ProducerService producerService;

    @GetMapping("/demo")
    public String getProducerService(@RequestParam String urlProfile, @RequestParam String urlGroup, @RequestParam String urlFanpage) {
        producerService.produce(new Message(urlProfile, urlGroup, urlFanpage));
        return "getProducerService => Status: working!";
    }

//    @GetMapping("/demoNew")
//    public String getProducerSerzxczczxvice(@RequestParam String message, @RequestParam Integer age) {
//        Random random = new Random();
//        producerService.produceasda(new Blog(message, age + random.nextInt()));
//        return "getProducerService => Status: working!";
//    }

//    @GetMapping("testNew")
//    public String pubNewMess(@RequestParam String message, @RequestParam Integer age) {
//        producerService.produceNew(new Message(message, age));
//
//        return "pubNewMess => Status: working!";
//    }
}
