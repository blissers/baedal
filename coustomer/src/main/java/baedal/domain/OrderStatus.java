package baedal.domain;

import baedal.CoustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderStatus_table")
@Data

public class OrderStatus  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;


    public static OrderStatusRepository repository(){
        OrderStatusRepository orderStatusRepository = CoustomerApplication.applicationContext.getBean(OrderStatusRepository.class);
        return orderStatusRepository;
    }




    public static void notify(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }
    public static void notify(OrderRejected orderRejected){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }
    public static void notify(OrderStarted orderStarted){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderStarted.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }
    public static void notify(OrderFinished orderFinished){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderFinished.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }
    public static void notify(Picked picked){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(picked.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }
    public static void notify(Delivered delivered){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }
    public static void notify(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        OrderStatus orderStatus = new OrderStatus();
        repository().save(orderStatus);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(orderStatus->{
            
            orderStatus // do something
            repository().save(orderStatus);


         });
        */

        
    }


}
