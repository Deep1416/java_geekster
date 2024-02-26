import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
          int x = sc.nextInt();
          int y = sc.nextInt();
          if(x < y){
            System.out.println("first");
          }else if(x+y == 0){
            System.out.println("Any");
          }else if(y < x){
            System.out.println("Second");
          }
        } 
    }
}
