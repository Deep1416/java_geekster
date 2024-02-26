import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars in the first line: ");
        int m = scanner.nextInt();
        System.out.print("Enter the total number of lines: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
