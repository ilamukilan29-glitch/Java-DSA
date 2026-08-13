package NewJava;
import java.util.Scanner;
public class FormattingLargeProducts{
    static int product(int a,int b){
        int prod =1;
        for(int i=a;i<=b;i++){
            prod*=i;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int res = product(a, b);
        int count=0;
        while(res>0){
            int temp = res%10;
            if(temp==0){
                res/=10;
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(res+" * "+"10^"+count);
    }
}