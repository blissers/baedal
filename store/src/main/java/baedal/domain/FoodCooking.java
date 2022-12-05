package baedal.domain;

import baedal.domain.OrderFinished;
import baedal.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="FoodCooking_table")
@Data

public class FoodCooking  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String options;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderFinished orderFinished = new OrderFinished(this);
        orderFinished.publishAfterCommit();

    }

    public static FoodCookingRepository repository(){
        FoodCookingRepository foodCookingRepository = StoreApplication.applicationContext.getBean(FoodCookingRepository.class);
        return foodCookingRepository;
    }



    public void accept(AcceptCommand acceptCommand){
        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();

        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }
    public void start(){
        OrderStarted orderStarted = new OrderStarted(this);
        orderStarted.publishAfterCommit();

    }

    public static void orderInfo(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);


         });
        */

        
    }
    public static void updateStatus(Paid paid){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        OrderRejected orderRejected = new OrderRejected(foodCooking);
        orderRejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);

            OrderRejected orderRejected = new OrderRejected(foodCooking);
            orderRejected.publishAfterCommit();

         });
        */

        
    }
    public static void updateStatus(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        FoodCooking foodCooking = new FoodCooking();
        repository().save(foodCooking);

        OrderRejected orderRejected = new OrderRejected(foodCooking);
        orderRejected.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(foodCooking->{
            
            foodCooking // do something
            repository().save(foodCooking);

            OrderRejected orderRejected = new OrderRejected(foodCooking);
            orderRejected.publishAfterCommit();

         });
        */

        
    }


}
