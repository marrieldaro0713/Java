public class PersonalProfilePrinter {
    public static void main(String[] args) {
        // Reference type variable
        String fullName = "Marriel Daro";

        // Primitive type variables
        int age = 19;
        double heightInFeet = 5.1; // height in feet (5'1")
        char initial = 'M';
        boolean isEnrolled = true; // true represents "Enrolled" status

        // Printing all values on separate, clearly labeled lines
        System.out.println("Full Name: " + fullName);
        System.out.println("Middle/First Initial: " + initial);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + heightInFeet + " feet");
        System.out.println("Student Status: " + (isEnrolled ? "Enrolled" : "Not Enrolled"));
    }
}