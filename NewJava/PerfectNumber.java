package NewJava;
import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfectSqr(int n){
        for(int i=2;i<=n/2;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        if(a>b || a==0){
            System.out.println("Invalid Input");
        }
        else{
            for(int i=a;i<=b;i++){
            if(isPerfectSqr(i)){
                count++;
            }
        }
        
             System.out.println(count);
       
        }
      

    }
}
