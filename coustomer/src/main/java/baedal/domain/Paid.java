package baedal.domain;

import baedal.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
}
