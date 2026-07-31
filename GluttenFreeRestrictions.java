public class GluttenFreeRestrictions {

    public static boolean isGlutenFree(String food) {
        String item = food.toLowerCase();

        return item.contains("rice")
                || item.contains("salad")
                || item.contains("vegetable")
                || item.contains("chicken");
    }

    public static void main(String[] args) {
        String food = "Vegetable Rice Bowl";

        if (isGlutenFree(food)) {
            System.out.println(food + " is gluten-free.");
        } else {
            System.out.println(food + " may contain gluten.");
        }
    }
}
