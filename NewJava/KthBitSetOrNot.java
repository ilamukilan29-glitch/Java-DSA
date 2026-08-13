package NewJava;
import java.util.Scanner;
public class KthBitSetOrNot {
    static int[] DeciToBinary(int n){
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
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] res = new int[32];
        res = DeciToBinary(n);
        if(res[k]==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
