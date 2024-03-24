import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String fullName = fullName("MehDI", "hAfEZi");
        System.out.println("Full name: " + fullName);

        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        boolean validInput = false;

        // Keep prompting user until valid phone number is entered
        do {
            System.out.print("Phone: ");
            phoneNumber = scanner.nextLine();
            String formattedNumber = formatPhoneNumber(phoneNumber);
            if (!formattedNumber.equals("Wrong entry. Try again.")) {
                System.out.println("Output: " + formattedNumber);
                validInput = true;
            } else {
                System.out.println(formattedNumber);
            }
        } while (!validInput);

        scanner.close();
    }


    public static String fullName(String firstName, String lastName) {
        // Correct the format of the first name
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        // Correct the format of the last name
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        // Return the full name
        return firstName + " " + lastName;
    }

    public static String formatPhoneNumber(String phoneNumber) {
        // Check if phone number starts with 9 and has 10 digits
        if (phoneNumber.length() == 10 && phoneNumber.startsWith("9")) {
            return "0" + phoneNumber; // Add '0' at the beginning
        } else {
            return "Wrong entry. Try again.";
        }


    }
}