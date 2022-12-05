package baedal.domain;

import baedal.domain.OrderPlaced;
import baedal.domain.OrderCanceled;
import baedal.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        baedal.external.CancelPaymentCommand cancelPaymentCommand = new baedal.external.CancelPaymentCommand();
        // mappings goes here
        FrontApplication.applicationContext.getBean(baedal.external.PaymentService.class)
            .cancelPayment(/* get???(), */ cancelPaymentCommand);



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

        // Get request from Payment
        //baedal.external.Payment payment =
        //    Application.applicationContext.getBean(baedal.external.PaymentService.class)
        //    .getPayment(/** mapping value needed */);

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
