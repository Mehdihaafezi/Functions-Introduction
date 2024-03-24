public class Main {
    public static void main(String[] args) {


        String fullName = formatName("MehDI", "hAfEZi");
        System.out.println("Full name: " + fullName);

    }
    public static String formatName(String firstName, String lastName) {
        // Correct the format of the first name
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        // Correct the format of the last name
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        // Return the full name
        return firstName + " " + lastName;
    }

}