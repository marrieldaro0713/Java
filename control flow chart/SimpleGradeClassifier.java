
package simplegradeclassifier;

public class SimpleGradeClassifier {

    public static void main(String[] args) {
        // 1. Mag-declare ng int score variable na may test value
        int score = 75; 

        // 2. Gumamit ng single if-else statement para i-classify ang score
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}