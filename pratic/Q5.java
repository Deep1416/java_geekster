package pratic;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    int sp = 1 ;
    int st = n;
    for(int i = 0 ; i < n ;i++){
        for(int j = 0 ; j < sp ; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < st ;j++){
            System.out.print("*");
        }
        st--;
        sp++;
        System.out.println();
    }
    } 
}
