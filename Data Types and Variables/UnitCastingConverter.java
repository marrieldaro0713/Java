
public class UnitCastingConverter {
    public static void main(String[] args) {

        double centimeters = 175.8;

        int wholeMeters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (wholeMeters * 100);

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        // Implicit widening: int to double.
        // No cast is needed because double can store int values.
        int number = 25;
        double widenedNumber = number;
        System.out.println("Implicit Widening: " + widenedNumber);

        // Explicit narrowing: double to int loses the decimal part.
        double decimalNumber = 12.75;
        int narrowedNumber = (int) decimalNumber;
        System.out.println("Explicit Narrowing: " + narrowedNumber);
    }
}

