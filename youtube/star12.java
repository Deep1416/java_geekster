package youtube;

public class star12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            for (int l = 3; l >= i; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for(int i = 1; i <= 4;i++){
        // for(int j = 4; j >=1 ;j--){
        // if(j>i){
        // System.out.print(" ");
        // }else{
        // System.out.print(" *");
        // }
        // }
        // System.out.println();
        // }
        // for(int i = 1; i<=4;i++){
        // for(int j = 1;j <=1;j++){
        // if(j<i){
        // System.out.println(" ");
        // }else{
        // System.out.println("*");
        // }
        // }
        // System.out.println();
        // }

    }
}
