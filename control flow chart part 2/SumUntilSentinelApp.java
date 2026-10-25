package sumuntilsentinelapp;

import java.util.Scanner;

public class SumUntilSentinelApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalSum = 0;
        
        System.out.println("Maglagay ng mga numero para ipag-add (I-type ang -1 para huminto):");
        
        // Magbasa ng unang integer input
        int input = scanner.nextInt();
        
        // 1. Gumamit ng while loop na patuloy na nagbabasa ng integers
        // 2. Huhinto ang loop kapag ang value ay -1
        while (input != -1) {
            // Idagdag ang value sa running total
            totalSum += input;
            
            // Magbasa ulit ng kasunod na integer
            input = scanner.nextInt();
        }
        
        // 3. I-print ang final total pagkatapos matapos ng loop
        System.out.println("Final Total: " + totalSum);
        
        scanner.close();
    }
}