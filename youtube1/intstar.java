package youtube1;

import java.util.Scanner;

public class intstar {
       public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 1;i <=n;i++){
            for( int j =n;j >=i;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
