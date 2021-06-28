package pon.demo.connectKafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String urlProfile;

    private String urlGroup;

    private String urlFanpage;
}
