package question;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no =sc.nextInt(); 
        int temp = 0 ;
        for(int i = 1 ; i <=no-1 ; i++){
            if(no%i == 0){
                temp = temp+1;
            }
        }
        if(temp==0){
            System.out.println(" prime no.");
        }else{
            System.out.println("Not prime no.");
        }

    }
}
