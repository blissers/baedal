package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderStarted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private String options;
    private String storeId;
    private String customerId;

    public OrderStarted(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderStarted(){
        super();
    }
}
