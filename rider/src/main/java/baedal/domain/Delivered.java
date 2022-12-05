package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String adress;

    public Delivered(Delivery aggregate){
        super(aggregate);
    }
    public Delivered(){
        super();
    }
}
