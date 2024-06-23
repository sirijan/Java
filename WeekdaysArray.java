package GGG;
import java.util.Scanner;
public class WeekdaysArray {
    public static void main(String[] args) {
        // Array to store weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            //User for day position
            System.out.print("Enter day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Check dayIndex is within the valid range
            if (dayIndex < 0 || dayIndex >= weekdays.length) {
                // Throw Exception if index is out of range
                throw new ArrayIndexOutOfBoundsException("Index should be between 0 and " + (weekdays.length - 1));
            }

            // Print the corresponding day name
            System.out.println("Day name: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            //Exception handle for index out of range
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Exception handle for other 
            System.out.println("Error: Invalid input. Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}