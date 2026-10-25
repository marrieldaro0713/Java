package numbersquareprinterapp;

public class NumberSquarePrinterApp {

    public static void main(String[] args) {
        // Change this variable to 20 to test the updated bound
        int maxBound = 10; 

        // 1. Use a for loop to count from 1 to maxBound
        for (int i = 1; i <= maxBound; i++) {
            // Calculate the square of the current number
            int square = i * i;
            
            // 2. Print the number and its square on the same line, clearly labeled
            System.out.println("Number: " + i + " | Square: " + square);
        }
    }
}