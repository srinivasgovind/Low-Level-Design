package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    //Publisher
    private static Flipkart flipkart = null;

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();

    public static Flipkart getInstance() {
        if (flipkart == null) {
            flipkart = new Flipkart();
        }
        return flipkart;
    }

    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }

    void unregisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced() {
        for (OnOrderPlacedSubscriber subscriber : onOrderPlacedSubscribers) {
            subscriber.announceOrderPlaced();
        }
    }
}
