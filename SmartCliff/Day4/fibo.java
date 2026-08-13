package SmartCliff.Day4;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0;
        int s=1;
        for(int i=0;i<=n;i++){
            System.out.print(f +" "); 
            int temp = f+s;
             f = s;
             s=temp;
             
             

             
            
        }
    }
}
