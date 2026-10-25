package atmtransactionauthorizer;

public class ATMTransactionAuthorizer {

    public static void main(String[] args) {
        // --- System Account Data ---
        String correctUsername = "john_doe";
        int correctPin = 1234;
        double accountBalance = 15000.00; // Total money in account

        // --- Transaction Request Inputs (Palitan ang mga ito para ma-test ang iba't ibang scenario) ---
        String inputUsername = "john_doe";
        int inputPin = 1234;
        double withdrawAmount = 2000.00;

        // 1. Nested if: Check username AND 4-digit PIN before proceeding
        if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin) {

                // 2. Else-if ladder: Determine account tier from balance
                String tier = "";
                double dailyLimit = 0.0;

                if (accountBalance >= 50000) {
                    tier = "Platinum";
                    dailyLimit = 20000.0;
                } else if (accountBalance >= 20000) {
                    tier = "Gold";
                    dailyLimit = 10000.0;
                } else if (accountBalance >= 5000) {
                    tier = "Silver";
                    dailyLimit = 5000.0;
                } else {
                    tier = "Bronze";
                    dailyLimit = 2000.0;
                }

                // 3. Switch statement: Set transaction fee percentage based on account tier
                double feeRate = 0.0;
                switch (tier) {
                    case "Platinum":
                        feeRate = 0.00; // 0% fee
                        break;
                    case "Gold":
                        feeRate = 0.01; // 1% fee
                        break;
                    case "Silver":
                        feeRate = 0.02; // 2% fee
                        break;
                    case "Bronze":
                        feeRate = 0.03; // 3% fee
                        break;
                }

                // Calculate total amount needed (Withdrawal + Transaction Fee)
                double feeAmount = withdrawAmount * feeRate;
                double totalDeduction = withdrawAmount + feeAmount;

                // 4. Nested if: Check daily limit AND sufficient balance
                if (withdrawAmount <= dailyLimit) {
                    if (totalDeduction <= accountBalance) {
                        double remainingBalance = accountBalance - totalDeduction;

                        // APPROVE
                        System.out.println("TRANSACTION APPROVED!");
                        System.out.println("Account Tier: " + tier);
                        System.out.println("Requested Withdrawal: $" + withdrawAmount);
                        System.out.println("Transaction Fee (" + (feeRate * 100) + "%): $" + feeAmount);
                        System.out.println("Total Amount Deducted: $" + totalDeduction);
                        System.out.println("Remaining Balance: $" + remainingBalance);

                    } else {
                        // DENY - Insufficient balance
                        System.out.println("TRANSACTION DENIED: Insufficient account balance (including fee).");
                        System.out.println("Required Total: $" + totalDeduction + " | Current Balance: $" + accountBalance);
                    }
                } else {
                    // DENY - Exceeds daily limit
                    System.out.println("TRANSACTION DENIED: Withdrawal amount exceeds your daily limit of $" + dailyLimit + " for " + tier + " tier.");
                }

            } else {
                // DENY - Incorrect PIN
                System.out.println("TRANSACTION DENIED: Incorrect PIN.");
            }
        } else {
            // DENY - Incorrect Username
            System.out.println("TRANSACTION DENIED: Invalid username.");
        }
    }
}