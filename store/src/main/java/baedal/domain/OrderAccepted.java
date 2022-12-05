package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private String options;
    private String storeId;
    private String customerId;

    public OrderAccepted(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
