package function;
 import java.util.*;
public class f3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // int sp = 0 ; 
        // int st = m; 
        for(int i = 0 ; i < (m/2)+1 ; i++){
            for(int j = 0 ; j < i;j++){
                System.out.print("\t");
            }
            for(int j = 0 ;j< m-1 ;j++){
                System.out.print("*\t");
            }
            // st -=2;
            // sp ++;
            System.out.println();
        }
    }
}
