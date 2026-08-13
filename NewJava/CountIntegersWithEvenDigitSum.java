package NewJava;
import java.util.Scanner;

public class CountIntegersWithEvenDigitSum {
    static int digitSum(int n){
        int sum =0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int count=0;
         for(int i=2;i<=n;i++){
            if(digitSum(i)%2==0){
                count++;
            }
         }
         System.out.println(count);
    }
   
}
