package partice;
import java.util.*;
public class Q_3 {
    
        public static void main(String[] args) {
            // Loop through characters from 'a' to 'z'
            // for (char ch = 'a'; ch <= 'z'; ch++) {
            //     // Print each character on a separate line
            //     System.out.println(ch);
            // }
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
              int i = 1;
              int power = 1;
            while(i++ <=n){
                
                power *=10;
                
            } 
            System.out.println(power);
           
        }
    }
    

