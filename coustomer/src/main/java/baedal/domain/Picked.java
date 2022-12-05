package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String adress;
}


