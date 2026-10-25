package warehouseinventoryapp;

import java.util.Scanner;

public class WarehouseInventoryApp {

    // 1. Represent a warehouse as a 2D array of item counts (-1 means damaged shelf)
    static int[][] warehouse = {
        {15, 20, -1, 5},   // Aisle 0 (may damaged shelf sa shelf 2)
        {2, 12, 18, 25},   // Aisle 1 (may critically low item < 5 sa shelf 0)
        {-1, 30, 40, 10}   // Aisle 2 (may damaged shelf sa shelf 0)
    };

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        // 2. Use a do-while driven menu that runs until the user chooses to exit
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY SYSTEM ===");
            System.out.println("1. Calculate Total Inventory (Skip Damaged)");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Restock Shelf");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateTotalInventory();
                    break;
                case 2:
                    findCriticallyLowShelf();
                    break;
                case 3:
                    restockSystem();
                    break;
                case 4:
                    System.out.println("Exiting Warehouse Inventory System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // 3. Use a for loop with continue to total inventory while skipping damaged shelves
    public static void calculateTotalInventory() {
        int totalItems = 0;

        for (int aisle = 0; aisle < warehouse.length; aisle++) {
            for (int shelf = 0; shelf < warehouse[aisle].length; shelf++) {
                int count = warehouse[aisle][shelf];

                // Skip damaged shelves (-1) using continue
                if (count == -1) {
                    continue; 
                }

                totalItems += count;
            }
        }

        System.out.println("\n[RESULT] Total Inventory Count (excluding damaged shelves): " + totalItems);
    }

    // 4a. Use nested loops with break to find the first critically low shelf (< 5 items)
    public static void findCriticallyLowShelf() {
        boolean found = false;
        int targetAisle = -1;
        int targetShelf = -1;

        for (int aisle = 0; aisle < warehouse.length; aisle++) {
            for (int shelf = 0; shelf < warehouse[aisle].length; shelf++) {
                int count = warehouse[aisle][shelf];

                // Critically low condition (halimbawa: mababa sa 5 items, pero hindi -1)
                if (count >= 0 && count < 5) {
                    targetAisle = aisle;
                    targetShelf = shelf;
                    found = true;
                    break; // Inihihinto ang inner loop kapag nahanap na ang unang low shelf
                }
            }

            if (found) {
                break; // Inihihinto rin ang outer loop kapag nahanap na
            }
        }

        if (found) {
            System.out.println("\n[ALERT] First critically low shelf found at Aisle " 
                               + targetAisle + ", Shelf " + targetShelf 
                               + " (Current Items: " + warehouse[targetAisle][targetShelf] + ")");
        } else {
            System.out.println("\n[INFO] No critically low shelves found.");
        }
    }

    // 4b. Use a while loop plus return to simulate restocking with input validation
    public static void restockSystem() {
        System.out.print("\nEnter Aisle index (0-2): ");
        int aisle = scanner.nextInt();
        System.out.print("Enter Shelf index (0-3): ");
        int shelf = scanner.nextInt();

        // Validations
        if (aisle < 0 || aisle >= warehouse.length || shelf < 0 || shelf >= warehouse[0].length) {
            System.out.println("[ERROR] Invalid aisle or shelf position.");
            return; // Inihihinto agad ang method gamit ang return
        }

        if (warehouse[aisle][shelf] == -1) {
            System.out.println("[ERROR] Cannot restock a damaged shelf!");
            return; // Exit function
        }

        int addedStock = 0;

        // While loop for input validation (dapat positive number ang idagdag)
        while (true) {
            System.out.print("Enter amount of stock to add (must be > 0): ");
            addedStock = scanner.nextInt();

            if (addedStock > 0) {
                break; // Lalabas sa input validation loop kapag tama ang input
            }

            System.out.println("Invalid amount! Quantity must be greater than zero.");
        }

        warehouse[aisle][shelf] += addedStock;
        System.out.println("[SUCCESS] Shelf restocked successfully! New count at Aisle " 
                           + aisle + ", Shelf " + shelf + " is: " + warehouse[aisle][shelf]);
    }
}