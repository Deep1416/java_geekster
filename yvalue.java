import java.util.*;
public class yvalue{
    public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String str = scanner.nextLine();
    
            int countS = 0;
            int countA = 0;
    
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 's' || ch == 'S') {
                    countS++;
                } else if (ch == 'a' || ch == 'A') {
                    countA++;
                }
            }
    
            System.out.println("Number of 's' characters: " + countS);
            System.out.println("Number of 'a' characters: " + countA);
    
            scanner.close();
        }
    }