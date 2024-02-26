import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int steps = 0; // Initialize the steps counter

        while (n > 0) {
            if (n % 2 == 0) {
                // If n is even, subtract 1
                n -= 1;
            } else {
                // If n is odd, subtract 3
                n -= 3;
            }
            steps++; // Increment the steps counter after each operation
        }

        System.out.println("Total number of steps taken: " + steps);
        scanner.close();
    }
}
