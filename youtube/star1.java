package youtube;
import java.util.*;
public class star1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner( System.in);
        int x = Sc.nextInt();
        int y = Sc.nextInt();
       for(int i = 1;i <= x ;i++){
        for(int j= 1; j <= y;j++){
            System.out.print("*");
        }
        System.out.println("*");
       }
   }
}