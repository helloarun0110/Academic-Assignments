// Practice Problem 8-b

class Restaurant {
    private String name;
    private double foodPrice;

    public Restaurant(String name, double foodPrice) {
        this.name = name;
        this.foodPrice = foodPrice;
    }

    public double calculateTotalBill() {
        return foodPrice + (foodPrice * 0.10);
    }

    public int estimateDeliveryTime() {
        return 40;
    }

    public String getName() {
        return name;
    }

 
    public double getFoodPrice() {
        return foodPrice;
    }
}

class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant(String name, double foodPrice) {
        super(name, foodPrice);
    }

    @Override
    public double calculateTotalBill() {
        return getFoodPrice() + (getFoodPrice() * 0.15);  
    }

    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    public FineDiningRestaurant(String name, double foodPrice) {
        super(name, foodPrice);
    }

    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Restaurant regularRestaurant = new Restaurant("Family Diner", 25.00);
        FastFoodRestaurant burgerPlace = new FastFoodRestaurant("Burger King", 15.00);
        FineDiningRestaurant gourmetSpot = new FineDiningRestaurant("Le Gourmet", 50.00);

        displayRestaurantInfo(regularRestaurant);
        displayRestaurantInfo(burgerPlace);
        displayRestaurantInfo(gourmetSpot);
    }

    private static void displayRestaurantInfo(Restaurant restaurant) {
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Total Bill: $" + restaurant.calculateTotalBill());
        System.out.println("Estimated Delivery Time: " + restaurant.estimateDeliveryTime() + " mins");
        System.out.println("------------------------");
    }
}
