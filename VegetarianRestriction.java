public class VegetarianRestriction {

    public static boolean isVegetarian(String food) {
        food = food.toLowerCase();

        if (food.contains("chicken")) {
            return false;
        }
        if (food.contains("beef")) {
            return false;
        }
        if (food.contains("pork")) {
            return false;
        }
        if (food.contains("fish")) {
            return false;
        }
        if (food.contains("turkey")) {
            return false;
        }
        if (food.contains("shrimp")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String food = "Vegetable Pizza";

        boolean result = isVegetarian(food);

        if (result) {
            System.out.println(food + " is vegetarian.");
        } else {
            System.out.println(food + " is not vegetarian.");
        }
    }
}
