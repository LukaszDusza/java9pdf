package zadanieRestauracja;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimerTask;

public class HungryCrowd extends TimerTask{



    private Random random = new Random();
    ;
    private Map<Dish, Integer> order;

    @Override
    public synchronized void run() {
        order = new HashMap<>();
        int choose = random.nextInt(Dish.values().length);
        Dish orderedDish = Dish.values()[choose];
        Integer amount = random.nextInt(5) + 2;
        order.put(orderedDish, amount);
        showCustomerOrder();
    }

    public void showCustomerOrder() {
        System.out.println("Custommer order:");
        for (Map.Entry<Dish, Integer> entry : order.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }
    }

}
