package apnayoutube;
import java.util.*;
public class hw {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
             for(int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        
    }
}