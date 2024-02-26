import java.util.*;
public class highsum{
    public static void main(String[] args) {
        //Scanner Sc = new Scanner(System.in);
        Scanner Sc = new Scanner(System.in);
        int income = Sc.nextInt();
        if(income<=500000){
            System.out.println("No tax to be paid");
        }else if (income>=500000)
        {
            System.out.println("Tax to be paid");
        }
    }
}