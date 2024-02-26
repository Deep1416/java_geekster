package question;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        // Scanner Sc = new Scanner(System.in);
        // int m;
        // int n = Sc.nextInt();
        // if (n <= 0) {
        //     for (int i = 1; i <= n; i -= 3) {
        //         m = n - 3;
        //         System.out.println(i);
        //     }
        // }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = n; i >= 1;i--){
        //     if( i % 2 !=0){
        //         System.out.println(i);
        //     }
        // }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 0; i <= n; i++){
        //     if(i % 2 ==0){
        //         System.out.println(i);
        //     }
        // }

    //         Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int base = 17;
    //     int power = 1;
    //    while(power <= n){
    //        System.out.print((int) Math.pow(base, power) + " ");
    //        power++;
    //    }

//     }
// }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int base = 17;
        long power = 1;
        
        System.out.println("Powers of 17 from 1 to " + n + ":");
        
        while (power <= n) {
            System.out.println(base + " ^ " + power + " = " + (int) Math.pow(base, power));
            power++;
        }
    }
}

