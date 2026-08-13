package SmartCliff.Day4.Day5;
import java.util.Scanner;
public class InvertedReversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        for(int i=n;i>=1;i--){  
            int r=n;
            for(int j=1;j<=i;j++){
               if(j==1){
                System.out.print(n+" ");
               }
               if(j>1){
                System.out.print(n-j+1+" ");
               }
              
            }
            System.out.println();
        }
    }
}
