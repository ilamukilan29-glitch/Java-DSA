package NewJava;
import java.util.Scanner;

public class RandomMostDiffBit {
    static int[] DeciToBi(int n){
        int[] arr = new int[32];
        int place = 0;
        while(n>0){
            int temp = n%2;
            arr[place]=temp;
            place++;
            n/=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] a1,b1 = new int[32];
        a1 = DeciToBi(a);
        b1 = DeciToBi(b);
        int res=1;
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=b1[i]){
                res=i;
                break;
            }
        }
        System.out.println(res+1);
    }
}
