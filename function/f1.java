package function;

import java.util.*;

public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<  (n/2)+1 ;i++){
            for(int j = 0 ; j< i ;j++ ){
                System.out.print(" ");
            }
            for(int j = i ; j < n-i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = (n/2)-1 ; i>=0 ;i--){
            for(int j = 0 ; j< i ;j++ ){
                System.out.print(" ");
            }
            for(int j = i ; j < n-i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
