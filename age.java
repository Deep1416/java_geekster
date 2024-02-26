import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class age{
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
        int age = Sc.nextInt();
        if(age >= 70){
            System.out.println("Super Senior Citizen");
        }else if (age >= 59){
            System.out.println("Senior Citizen");
        }else if (age >= 18){
            System.out.println("Adult");
        }else if (age > 1){
            System.out.println("Underage");
        }else{
            System.out.println("New Born");
        }
    }
}
        // Scanner Sc = new Scanner(System.in);
        // int age = Sc.nextInt();
        // if (age >= 70) {
        //     System.out.println("Super Senior Citizen");
        // } else if (age >= 59) {
        //     System.out.println("Senior Citizen");
        // } else if (age >= 18) {
        //     System.out.println("Adult");
        // } else if (age > 1) {
        //     System.out.println("Underage");
        // } else {
        //     System.out.println("New Born");
        // }