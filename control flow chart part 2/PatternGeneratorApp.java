package patterngeneratorapp;

public class PatternGeneratorApp {

    public static void main(String[] args) {
        int size = 5; // Laki ng pattern (5x5 grid)

        // Outer loop para sa mga row (mula 1 hanggang size)
        for (int row = 1; row <= size; row++) {

            // DEMONSTRATING 'continue': Laktawan ang pag-print ng buong Row 3
            if (row == 3) {
                // Pinapalaktaw ang natitirang code para sa row 3 at dumidirekta sa kasunod na row
                continue; 
            }

            // Inner loop para sa mga column
            for (int col = 1; col <= size; col++) {

                // DEMONSTRATING 'break': Ihinto nang maaga ang INNER loop kapag naabot ang column 4
                if (col == 4) {
                    // Tinitigil ang inner loop para sa kasalukuyang row
                    break; 
                }

                // Mag-print ng asterisiko (*) o numero
                System.out.print("* ");
            }

            // Lumipat sa kasunod na linya pagkatapos ng bawat row
            System.out.println();
        }
    }
}