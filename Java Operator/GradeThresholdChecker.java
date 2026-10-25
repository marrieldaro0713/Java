
public class GradeThresholdChecker {
    public static void main(String[] args) {

        double averageGrade = 85.0;
        int absences = 2;

        boolean passed = (averageGrade >= 75 && absences <= 3)
                         || averageGrade >= 90;

        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Number of Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("Reason: You met the grade and attendance requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Your grade and absences do not meet the requirements.");
        }
    }
}
