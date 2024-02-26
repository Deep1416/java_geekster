import java.util.*;
public class dayexample {
    public static void main(String[] args) {
          // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.println("Enter a number between 1 and 7:");

        // Read the number from the user
        int number = scanner.nextInt();

        // Use a switch statement to determine the name of the day of the week
        String dayOfWeek;
        switch (number) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid input";
                break;
        }

        // Print the corresponding name of the day of the week
        System.out.println("Day of the week: " + dayOfWeek);

        // Close the scanner
        scanner.close();
    }
}
    

