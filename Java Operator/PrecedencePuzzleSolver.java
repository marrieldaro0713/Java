
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // Prediction: true, because multiplication is done first.
        System.out.println("Expression 1: " + (a + b * 2 > 10));
        // Actual result: true, because 5 + 6 = 11, and 11 is greater than 10.

        int age = 19;
        int grade = 85;

        // Prediction: true, because both conditions are true.
        System.out.println("Expression 2: " + (age >= 18 && grade >= 75));
        // Actual result: true, because the age and grade meet the conditions.

        int number = 5;

        // Prediction: 5, because number++ uses the value before adding 1.
        System.out.println("Expression 3: " + (number++ > 5));
        // Actual result: false, because the comparison uses 5 before incrementing.
        // My prediction was wrong because I forgot that postfix increment happens after the value is used.
        System.out.println("Number after increment: " + number);
    }
}
