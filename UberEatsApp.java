public class UberEatsApp {

    public static void main(String[] args) {

        UberEatsProfile user1 = new UberEatsProfile(
                "Samuel",
                "samuel@example.com",
                "123-456-7890",
                "123 Main Street",
                "Vegetable Rice Bowl",
                true,
                true
        );

        user1.displayProfile();

        String food = user1.getFavoriteFood();

        System.out.println("\n===== Food Check =====");
        System.out.println(food + " is vegetarian: " + isVegetarian(food));
        System.out.println(food + " is gluten-free: " + isGlutenFree(food));
    }

    public static boolean isVegetarian(String food) {
        food = food.toLowerCase();

        return !food.contains("chicken")
                && !food.contains("beef")
                && !food.contains("pork")
                && !food.contains("fish")
                && !food.contains("turkey")
                && !food.contains("shrimp");
    }

    public static boolean isGlutenFree(String food) {
        food = food.toLowerCase();

        return food.contains("rice")
                || food.contains("salad")
                || food.contains("vegetable")
                || food.contains("grilled chicken");
    }

    static class UberEatsProfile {

        private String name;
        private String email;
        private String phoneNumber;
        private String address;
        private String favoriteFood;
        private boolean vegetarian;
        private boolean glutenFree;

        public UberEatsProfile(String name, String email, String phoneNumber,
                               String address, String favoriteFood,
                               boolean vegetarian, boolean glutenFree) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.favoriteFood = favoriteFood;
            this.vegetarian = vegetarian;
            this.glutenFree = glutenFree;
        }

        public String getFavoriteFood() {
            return favoriteFood;
        }

        public void displayProfile() {
            System.out.println("===== Uber Eats Profile =====");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Address: " + address);
            System.out.println("Favorite Food: " + favoriteFood);
            System.out.println("Vegetarian: " + vegetarian);
            System.out.println("Gluten-Free: " + glutenFree);
        }
    }
}
