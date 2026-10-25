package multitierdiscountsystem;

public class MultiTierDiscountSystem {

    public static void main(String[] args) {
        // 1. Mag-declare ng double purchaseAmount variable
        double purchaseAmount = 7500.00; // Baguhin ang value na ito para ma-test
        
        double discountRate = 0.0;
        String discountTier = "";

        // 2. Gumamit ng else-if ladder na may 4 branches (naka-order nang maayos)
        if (purchaseAmount >= 10000) {
            discountRate = 0.15; // 15% discount
            discountTier = "15% Tier";
        } else if (purchaseAmount >= 5000) {
            discountRate = 0.10; // 10% discount
            discountTier = "10% Tier";
        } else if (purchaseAmount >= 1000) {
            discountRate = 0.05; // 5% discount
            discountTier = "5% Tier";
        } else {
            discountRate = 0.0;  // 0% discount
            discountTier = "No Discount Tier (0%)";
        }

        // Compute ang final discounted price
        double discountAmount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discountAmount;

        // 3. I-print ang discount tier at final discounted price
        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Final Discounted Price: $" + finalPrice);
    }
}