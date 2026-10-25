
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {

        int quantity = 3;
        double unitPrice = 49.99;
        String storeName = "ABC Store";

        double totalCost = quantity * unitPrice;

        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

        // totalCost should not be an int because
        // the price may include decimal values.
    }
}
