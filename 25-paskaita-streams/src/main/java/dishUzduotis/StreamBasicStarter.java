package dishUzduotis;

import java.util.List;

public class StreamBasicStarter {
    public static void start() {
        List<Dish> dishes = DishFactory.createSampleDishes();

        DishService service = new DishService();

        System.out.println("Hard names: " + service.getBoringDishNames(dishes));
        System.out.println("Easy names: " + service.getEasyDishNames(dishes));
        System.out.println("Expensive: " + service.getMostExpensiveDishEasy(dishes));
        System.out.println("DishViews: " + service.getDishView(dishes));
    }
}
