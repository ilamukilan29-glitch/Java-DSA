package SmartCliff.Day4;
import java.util.Scanner;
public class GCD{
    static int gcd(int a,int b){
        int max=1;
        int c=(a>b)?a:b;
        for(int i=1;i<=c/2;i++){
            if(a%i==0 && b%i==0){
                if(i>max){
                    max=i;
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }
}