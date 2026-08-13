package SmartCliff.Day4;
import java.util.Scanner;
import java.math.*;

public class Armstrong {
    static int arm(int n){
        int b =n;
          int dig = 0;
        int sum=0;
        while(n>0){
            dig+=1;
            n/=10;
        }
        while(b>0){
            int temp = b%10;
            sum+= Math.pow(temp, dig);
            b/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = arm(n);
        if(n==sum){
            System.out.println("Armstrong NO");
        }
        else{
            System.out.println("Not a Armstrong No");
        }
    }
}
