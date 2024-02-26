package apnayoutube;

public class withouttop {
    public static void main(String[] args) {
        int n = 13,  m = 3;
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<= n;j++){
                  
                  if( i == n  || j == 1  || j==n){
                    System.out.print("*");
                  }else{
                    System.out.print(" ");
                  }
            }
            System.out.println();
    }
}
}


