import java.util.*;
public class sutm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ;i <= n ; i++){
            int x = sc.nextInt();
            sum +=x;
            //sum = sum+i;
            System.out.print(sum + " ");
        }
        
    }
}
