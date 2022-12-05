package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private String options;
    private String storeId;
    private String customerId;
}


