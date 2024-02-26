import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        
    // Scanner Sc = new Scanner(System.in);
    //     int x = Sc.nextInt();
    //     int y = Sc.nextInt();
    //     int z = Sc.nextInt();
    //     if(x % 3 == 0){
    //         if(y >= 200){
    //             System.out.println(z + 10);
    //         }else if(y >= 100 && y < 200){
    //             System.out.println(z + 5);
    //         }else if (y >= 50 && y < 100){
    //             System.out.println(z + 4);
    //         }else{
    //             System.out.println(1 + z);
    //         }
    //     }else{
    //         // not divisible by 3 
    //         if(y >= 200){
    //             System.out.println(3 + z);
    //         }else if(y >= 100 && y <200){
    //             System.out.println(2 + z);
    //         }else{
    //             System.out.println(1 + z);
    //         }
    //     }

      Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of x, y, and z
        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y:");
        int y = scanner.nextInt();

        System.out.println("Enter the value of z:");
        int z = scanner.nextInt();

        // Perform operations based on the value of x
        if (x % 3 == 0) {
            // x is divisible by 3
            if (y >= 200) {
                System.out.println(z += 10);
            } else if (y >= 100 && y < 200) {
                System.out.println(z += 5);
            } else if (y >= 50 && y < 100) {
                z += 4;
            } else {
                z += 1;
            }
        } else {
            // x is not divisible by 3
            if (y >= 200) {
                z += 3;
            } else if (y >= 100 && y < 200) {
                z += 2;
            } else {
                z += 1;
            }
        }

        // Add 10 to the value of z
       // z += 10;



    }
}
