package NewJava;
import java.util.Scanner;
public class ReverseBinary {
    static long BiToDeci(int[] n){
        long res=0;
        int place=0;
        for(int ar:n){
            res+=ar*pow(2,place);
            place++;
        }
        return res;
    }
    static int pow(int base, int pow){
        int res =1;
        for(int i=1;i<=pow;i++){
            res*=base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[32];
        int p=31;
        for(int i=0;i<32;i++){
            arr[p]=(n>>i&1)==0?0:1;
            p--;
        }
        System.out.println(BiToDeci(arr));

    }
}
