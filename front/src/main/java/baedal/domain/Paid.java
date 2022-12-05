package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;

    public Paid(Payment aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
