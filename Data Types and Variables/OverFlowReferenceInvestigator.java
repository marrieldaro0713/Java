
public class OverflowReferenceInvestigator {
    public static void main(String[] args) {

        // 1. Demonstrate byte overflow after incrementing.
        byte number = 127;
        number++;
        System.out.println("Byte after overflow: " + number);

        // 2. Create two Strings using new String() and one using a literal.
        String text1 = new String("Java");
        String text2 = new String("Java");
        String text3 = "Java";

        // Pair 1: text1 and text2
        System.out.println("\nPair 1: text1 and text2");
        System.out.println("Using ==: " + (text1 == text2));
        System.out.println("Using equals(): " + text1.equals(text2));

        // Pair 2: text1 and text3
        System.out.println("\nPair 2: text1 and text3");
        System.out.println("Using ==: " + (text1 == text3));
        System.out.println("Using equals(): " + text1.equals(text3));

        // Pair 3: text2 and text3
        System.out.println("\nPair 3: text2 and text3");
        System.out.println("Using ==: " + (text2 == text3));
        System.out.println("Using equals(): " + text2.equals(text3));

        // == compares object references, not the text itself.
        // Each new String() creates a separate object.
        // The literal uses the String pool, so the references differ.
        // equals() compares the actual text, which is "Java" in all three.

        // 3. Demonstrate two variables sharing the same array reference.
        int[] firstArray = {10, 20, 30};
        int[] secondArray = firstArray;

        firstArray[0] = 99;

        System.out.println("\nFirst array value: " + firstArray[0]);
        System.out.println("Second array value: " + secondArray[0]);
    }
}
