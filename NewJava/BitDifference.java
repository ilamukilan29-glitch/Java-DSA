package NewJava;
import java.util.Scanner;
public class BitDifference {
    static int[] DeciToBi(int n){
        int[] res = new int[32];
        int place=0;
        while(n>0){
            int temp = n%2;
            res[place]=temp;
            place++;
            n/=2;
        }
        return res;
    }
    static int findDiff(int[] arr1,int[] arr2){
        int count=0;
        for(int i=0;i<32;i++){
            if(arr1[i]!=arr2[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1,arr2 = new int[32];
        arr1 = DeciToBi(n1);
        arr2 = DeciToBi(n2);
        int res = findDiff(arr1, arr2);
        System.out.println(res);



    }
}
