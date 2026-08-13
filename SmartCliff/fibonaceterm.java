package SmartCliff;
import java.util.Scanner;
public class fibonaceterm {
    static void findnthfibo(int n){
        int res=1;
        int f=1;
        int s=1;
        for(int i=1;i<=n;i++){
            int temp = f;
            f+=s;
            s=temp;
            res=s;
        }
        System.out.println(res);
        sumdig(res);
        countoddeven(res);
    }
    static void sumdig(int res){
        int sum=0;
        while(res>0){
            int temp = res%10;
            sum+=temp;
            res/=10;
        }
        System.out.println("Sum of The Digits: "+sum);
    }
    static void countoddeven(int res){
        int odd=0;
        int even=0;
        while(res>0){
            int temp = res%10;
            if(temp%2==0){
                even++;
            }
            else{
                odd++;
            }
            res/=10;
        }
        System.out.println("Odd Digits: "+odd);
        System.out.println("Even Digits: "+even);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findnthfibo(n);
    }
}
