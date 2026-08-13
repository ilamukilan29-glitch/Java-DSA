package NewJava;
import java.util.Scanner;

public class PerfectNO {
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input(Negative Number)");
        }
        else if(isPerfect(n)){
            System.out.println(n + " is a Perfect Number");
        }
        else{
            System.out.println(n + " is Not a Perfect Number");
        }
    }
}
