public class FoodOrder {

    // Function to order food with two items
    public void orderFood(String food1, int quantity1, String food2, int quantity2) {
        System.out.println("Ordered " + quantity1 + " " + food1 + "(s) and " + quantity2 + " " + food2 + "(s)");
    }

    // Function to order food with three items
    public void orderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3) {
        System.out.println("Ordered " + quantity1 + " " + food1 + "(s), " + quantity2 + " " + food2 + "(s), and " +
                           quantity3 + " " + food3 + "(s)");
    }

    // Function to order food with four items
    public void orderFood(String food1, int quantity1, String food2, int quantity2, 
                          String food3, int quantity3, String food4, int quantity4) {
        System.out.println("Ordered " + quantity1 + " " + food1 + "(s), " + quantity2 + " " + food2 + "(s), " +
                           quantity3 + " " + food3 + "(s), and " + quantity4 + " " + food4 + "(s)");
    }

    public static void main(String[] args) {
        // Create an instance of FoodOrder
        FoodOrder myOrder = new FoodOrder();

        // Example orders with different numbers of items
        myOrder.orderFood("Pizza", 2, "Burger", 3);
        myOrder.orderFood("Sushi", 1, "Pasta", 2, "Salad", 1);
        myOrder.orderFood("Chicken Wings", 4, "Fries", 2, "Coke", 3, "Ice Cream", 1);
    }
}
