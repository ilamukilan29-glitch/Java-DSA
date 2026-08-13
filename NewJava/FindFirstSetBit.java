package NewJava;
import java.util.Scanner;
public class FindFirstSetBit {
    static int DeciToBinary(int n){
        int place = 1;
        int res =0;
        while(n>0){
            int temp = n%2;
            res = res+temp*place;
            place*=10;
            n/=2;
        }
       
        return firstSetBit(res);
    }
    static int firstSetBit(int n){
        int pos =1;
        while(n>0){
            int temp = n%10;
            if(temp==1){
                return pos;
            }
            pos++;
            n/=10;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DeciToBinary(n));
    }
}
