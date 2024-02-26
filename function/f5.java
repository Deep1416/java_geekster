package function;
import java.util.*;
public class f5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int po = n;
        int power =0;
        int sum = 0;
        
        while(po > 0){
            po /= 10; 
            power++;
        }

        while(n > 0){
            int digit = n % 10;
            sum = sum + (int)(Math.pow(digit , power));
            n /=10;
        }

        if(sum == original){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
