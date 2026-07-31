import java.util.ArrayList;
import java.util.Scanner;

public class UberEatsSimpleOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> cart = new ArrayList<>();
        double total = 0;

        System.out.println("===== Welcome to Uber Eats =====");

        boolean keepOrdering = true;

        while (keepOrdering) {
            System.out.println("\nChoose a restaurant:");
            System.out.println("1. Popeyes");
            System.out.println("2. Chick-fil-A");
            System.out.println("3. McDonald's");
            System.out.println("4. Domino's");
            System.out.println("0. Checkout");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 0) {
                keepOrdering = false;
            } else if (choice == 1) {
                cart.add("Popeyes - Chicken Sandwich - $5.99");
                total += 5.99;
                System.out.println("Chicken Sandwich from Popeyes added to your cart.");
            } else if (choice == 2) {
                cart.add("Chick-fil-A - Nuggets - $6.49");
                total += 6.49;
                System.out.println("Nuggets from Chick-fil-A added to your cart.");
            } else if (choice == 3) {
                cart.add("McDonald's - Big Mac - $5.99");
                total += 5.99;
                System.out.println("Big Mac from McDonald's added to your cart.");
            } else if (choice == 4) {
                cart.add("Domino's - Cheese Pizza - $8.99");
                total += 8.99;
                System.out.println("Cheese Pizza from Domino's added to your cart.");
            } else {
                System.out.println("Sorry, that choice is not available.");
            }
        }

        System.out.println("\n===== Your Final Order =====");

        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (String item : cart) {
                System.out.println(item);
            }

            System.out.println("----------------------------");
            System.out.println("Total: $" + total);
            System.out.println("Thank you for ordering with Uber Eats!");
        }

        input.close();
    }
}
