
public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {

        // 1. Compound assignment operators
        double balance = 1000.0;

        System.out.println("Initial Balance: " + balance);

        balance += 200.0;
        System.out.println("After adding 200: " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        balance += 150.0;
        System.out.println("After adding 150: " + balance);

        // 2. Postfix increment
        int count = 5;

        System.out.println("\nPostfix increment result: " + count++);
        System.out.println("Count after postfix: " + count);

        // 3. Prefix increment
        count = 5;

        System.out.println("\nPrefix increment result: " + ++count);
        System.out.println("Count after prefix: " + count);

        // Postfix (count++) prints the current value first, then increments it.
        // Prefix (++count) increments the value first, then prints the new value.
    }
}

