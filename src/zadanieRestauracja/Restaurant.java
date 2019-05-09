package zadanieRestauracja;

import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

public class Restaurant extends TimerTask{


    private Map<Dish, Integer> dishMap;
    private Integer startAmount = new Integer("3");

    public Restaurant() {
        dishMap = new HashMap<>();

        for (Dish d : Dish.values()) {
            dishMap.put(d, startAmount);
        }

    }

    @Override
    public synchronized void run() {
        for (Map.Entry<Dish, Integer> entry : dishMap.entrySet()) {
            dishMap.put(entry.getKey(), entry.getValue() + 1);
        }
        showAvailableDishes();
    }

    public void showAvailableDishes() {
        System.out.println("You can order:");
        for (Map.Entry<Dish, Integer> entry : dishMap.entrySet()) {
            System.out.println(entry.getValue() + " x " + entry.getKey());
        }

    }
    }
