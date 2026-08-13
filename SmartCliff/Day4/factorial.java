package SmartCliff.Day4;
import java.util.Scanner;

public class factorial {
    static int fact(int n){
        int sum=1;
        if(n==0||n==1){
            return 1;
        }
        sum = n*fact(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
