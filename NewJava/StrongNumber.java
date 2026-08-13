package NewJava;
import java.util.Scanner;

public class StrongNumber {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact;
        fact = n*fact(n-1);
        return fact;
    }
    static int Strong(int n){
        int res=0;
        while(n>0){
            int temp = n%10;
            res= res+fact(temp);
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = Strong(n);
        System.out.println((res==n)?'1':'0');
    }
}
