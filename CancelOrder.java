public class CancelOrder {

    public static void main(String[] args) {

        String orderName = "Vegetable Rice Bowl";
        boolean restaurantStartedCooking = false;

        System.out.println("===== Cancel Order =====");
        System.out.println("Order: " + orderName);

        if (restaurantStartedCooking) {
            System.out.println("Sorry, this order cannot be fully cancelled.");
            System.out.println("The restaurant has already started preparing the food.");
        } else {
            System.out.println("Your order has been cancelled successfully.");
            System.out.println("A refund will be sent back to your payment method.");
        }
    }
}
