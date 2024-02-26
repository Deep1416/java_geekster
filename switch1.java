// You are given integer inputs N , a and b. perform operations on a and b for different value of N like :-

// If value of N is 10 -> a + b;

// If value of N is 20 -> a - b;

// If value of N is 30 -> a * b;

// If value of N is 40 -> a % b;

// If value of N is 50 -> a / b;

// else print Enter a valid number.
import java.util.*;
public class switch1{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        switch (N) {
            case 10:
                System.out.println(a + b);
                break;
            case 20:
                System.out.println(a - b);
                break;
            case 30:
                System.out.println(a * b);
                break;
            case 40:
                System.out.println(a % b);
                break;
            case 50:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Enter a valid number");    
                break;
        }

    }
}