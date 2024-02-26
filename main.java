import java.util.Scanner;

public class main {
    private static final char A = 0;
    private static final char B = 0;

    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        int y = Sc.nextInt();
        char ch = Sc.next().charAt(0);
        switch (key) {
            case value:
                
                break;
        
            default:
                break;
        }






        Switch(ch){
            case 'A':
               System.out.println("sum of the two integers");
               break;
            case 'S':
               System.out.println(x-y);
                break;
            case 'M':
               System.out.println(x*y);
               break;
            case 'D':
                System.out.println(x/y);
                break;
            case 'R':
                System.out.println(x%y);
                break;
            default:
                System.out.println("Enter again");
                    
        }
}
}
