package SmartCliff;
import java.util.Scanner;

public class RemoveDub {
    static int removeDub(int[] arr){
        int count =1;
        int curr = arr[0];
        for(int i=1,j=1;i<arr.length;i++){
            if(arr[i]!=curr){
                arr[j]=arr[i];
                curr = arr[i];
                j++;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();
        arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = removeDub(arr);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
