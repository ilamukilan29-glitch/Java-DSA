package NewJava;
import java.util.Scanner;
public class AbundantNumber {
    static int sumofFactor(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int res = sumofFactor(n);
        if(res>n){
            System.out.println(n+" is abundant number");
        }
        else{
            System.out.println("Not an abundant number");
        }
    }
}
