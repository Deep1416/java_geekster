import java.util.*;
public class day {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
       int N = Sc.nextInt();
        switch (N) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break; 
             case 7:
                System.out.println("Sunday");
                break;        
            default:
                System.out.println("Enter a valid day");    
                break;
        } 
    }
    
}
