package youtube;
import java.util.*;
public class star9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // for(int i = 1;i <=n;i++){
        //     for(int j = 4; j>=i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k =1;k <=i;k++){
        //         System.out.print("*");
        //     }
        //     for(int l = 2;l <=i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=  i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
