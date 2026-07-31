public class UberEatsTrackingOrder {

    public static String getDeliveryStatus(int step) {

        if (step == 0) {
            return "Order confirmed.";
        } else if (step == 1) {
            return "The restaurant is preparing your food.";
        } else if (step == 2) {
            return "The driver picked up your order.";
        } else if (step == 3) {
            return "The driver is on the way.";
        } else if (step == 4) {
            return "Your order was delivered.";
        } else {
            return "Delivery status is unavailable.";
        }
    }

    public static void main(String[] args) {

        int deliveryStep = 0;

        System.out.println("===== Uber Eats Delivery Tracking =====");

        System.out.println(getDeliveryStatus(deliveryStep));

        deliveryStep++;
        System.out.println(getDeliveryStatus(deliveryStep));

        deliveryStep++;
        System.out.println(getDeliveryStatus(deliveryStep));

        deliveryStep++;
        System.out.println(getDeliveryStatus(deliveryStep));

        deliveryStep++;
        System.out.println(getDeliveryStatus(deliveryStep));
    }
}
