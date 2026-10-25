package searchandsortminitoolapp;

import java.util.Arrays;

public class SearchAndSortMiniToolApp {

    public static void main(String[] args) {
        // Gamit ang kaparehong scores array mula sa nakaraang activity
        int[] scores = {85, 92, 78, 65, 88, 95, 72, 80};
        int target = 88; // Target value na hahanapin
        
        // 1. Implement linear search for a specific target value
        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        // Print search results
        System.out.println("=== LINEAR SEARCH ===");
        if (foundIndex != -1) {
            System.out.println("Target value " + target + " WAS FOUND at index " + foundIndex + ".");
        } else {
            System.out.println("Target value " + target + " WAS NOT FOUND in the array.");
        }

        // 2. Sort a COPY of the array using Arrays.sort()
        int[] scoresCopy = Arrays.copyOf(scores, scores.length);
        Arrays.sort(scoresCopy);

        // Print both original and sorted versions
        System.out.println("\n=== ARRAY COMPARISON ===");
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Copy:    " + Arrays.toString(scoresCopy));

        /* 
         * 3. EXPLANATION COMMENT:
         * Why sorting a copy (rather than the original) matters here:
         * 
         * Sorting a copy preserves the original order and index positioning of elements.
         * In real-world applications (like gradebooks), student IDs or names are often tied 
         * to specific array indices. If we sort the original array directly, we lose the 
         * initial sequence, which can break relationship mappings to other data (like student names) 
         * or distort future index-based searches on the original dataset.
         */
    }
}