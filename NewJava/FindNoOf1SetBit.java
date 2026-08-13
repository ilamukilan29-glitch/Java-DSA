package NewJava;
import java.util.Scanner;

public class FindNoOf1SetBit {
    static int DeciToBinary(int n){
        int res =0;
        int tem =n;
        while(n>0){
            int temp = n%2;
            res= res*10+temp;
            n/=2;
        }
        if(tem%2==0){
            res= res*10+0;
        }
        return count1Bits(res);
    }
    static int count1Bits(int n){
        int count=0;
        while(n>0){
            int temp = n%10;
            if(temp==1){
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DeciToBinary(n));

    }
}
