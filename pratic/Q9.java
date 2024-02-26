package pratic;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count= 1;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 0 ; j< count ; j++){
                
                System.out.print("* ");
            }
            count +=2;
            System.out.println();
        }
    }
}
