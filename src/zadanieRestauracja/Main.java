package zadanieRestauracja;


import java.util.Timer;

public class Main {
    public static void main(String[] args) {

        Timer timerRestaurant = new Timer();
        Timer timerCrowd = new Timer();
        int restaurantPeriod = 3;
        int orderPeriod = 3;

        Restaurant restaurant = new Restaurant();
        HungryCrowd hungryCrowd = new HungryCrowd();


       timerRestaurant.schedule(restaurant, restaurantPeriod*1000, restaurantPeriod*1000);
       timerCrowd.schedule(hungryCrowd, orderPeriod*1000, orderPeriod*1000);

    }
}
