package baedal.domain;

import baedal.domain.*;
import baedal.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String customerId;
}


