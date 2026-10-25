package nestedloginvalidator;

public class NestedLoginValidator {

    public static void main(String[] args) {
        // Mga tamang kredensyal at status
        String correctUsername = "admin";
        String correctPassword = "password123";
        boolean isAccountLocked = false;

        // Mga gagamiting input values (Baguhin ang mga ito para ma-test ang failure paths)
        String inputUsername = "admin";
        String inputPassword = "password123";

        // 1. Unang stage: I-check muna ang username
        if (inputUsername.equals(correctUsername)) {
            
            // 2. Pangalawang stage (Nested if): I-check ang password
            if (inputPassword.equals(correctPassword)) {
                
                // 3. Pangatlong stage (Deeper nested if): I-check kung naka-lock ang account
                if (!isAccountLocked) {
                    System.out.println("Login successful! Welcome back.");
                } else {
                    // Specific failure message kapag locked ang account
                    System.out.println("Login failed: Your account is locked.");
                }
                
            } else {
                // Specific failure message kapag mali ang password
                System.out.println("Login failed: Incorrect password.");
            }
            
        } else {
            // Specific failure message kapag mali ang username
            System.out.println("Login failed: Username not found.");
        }
    }
}