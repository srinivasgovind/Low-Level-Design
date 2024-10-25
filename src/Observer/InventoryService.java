package Observer;

import java.security.Provider;

public class InventoryService implements OnOrderPlacedSubscriber{

    static Flipkart flipkart = Flipkart.getInstance();

    InventoryService(){
        flipkart.registerSubscriber(this);
    }



    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory Service");
    }

    public void deRegister(){
        flipkart.unregisterSubscriber(this);
    }
}
