package classstatisticscalculatorapp;

public class ClassStatisticsCalculatorApp {

    public static void main(String[] args) {
        // 1. Mag-declare ng int array na may 8 student scores
        int[] scores = {85, 92, 78, 65, 88, 95, 72, 80};

        // Mga gagamiting variables para sa kompyutasyon
        int sum = 0;
        int highest = scores[0]; // I-initialize gamit ang unang score
        int lowest = scores[0];  // I-initialize gamit ang unang score

        // 2. Gamit ang loop (walang built-in shortcuts), kunin ang sum, highest, at lowest score
        for (int i = 0; i < scores.length; i++) {
            // Kunin ang sum
            sum += scores[i];

            // Hanapin ang pinakamataas na score
            if (scores[i] > highest) {
                highest = scores[i];
            }

            // Hanapin ang pinakamababang score
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Kompyutin ang average
        double average = (double) sum / scores.length;

        // 3. I-print ang lahat ng 4 na statistics na may malinaw na labels
        System.out.println("=== CLASS STATISTICS REPORT ===");
        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score:  " + lowest);
    }
}