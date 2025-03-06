import java.util.ArrayList;   // Importing ArrayList to store integers
import java.util.List;        // Importing List interface for flexibility
import java.util.Scanner;     // Importing Scanner for user input

public class IntegerSumCalculator {

    // Method to parse a string into an Integer
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str); // Converts string to Integer (Autoboxing happens here)
        } catch (NumberFormatException e) { // Handles invalid inputs that cannot be converted
            System.out.println("Invalid number format: " + str);
            return null; // Return null for invalid input
        }
    }

    // Method to calculate the sum of a list of Integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0; // Variable to store the sum
        for (Integer num : numbers) { // Iterates through the list
            if (num != null) { // Ensures null values are ignored
                sum += num; // Adds the value to sum (Unboxing happens here)
            }
        }
        return sum; // Returns the total sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object to take input
        List<Integer> numbers = new ArrayList<>(); // List to store integer inputs

        System.out.println("Enter numbers (type 'done' to finish):");

        while (true) { // Infinite loop until 'done' is entered
            String input = scanner.nextLine(); // Reads user input as a string
            if (input.equalsIgnoreCase("done")) { // Checks if user wants to stop
                break; // Exit loop
            }
            Integer number = parseStringToInteger(input); // Converts input to Integer
            if (number != null) { // Adds only valid numbers to the list
                numbers.add(number); // Autoboxing: Converts int to Integer automatically
            }
        }

        scanner.close(); // Closing the scanner to prevent memory leaks

        // Calculating and displaying the sum of valid numbers entered
        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
