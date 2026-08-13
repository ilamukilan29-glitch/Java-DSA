import java.util.Scanner;
public class SwapFirstAndSecondHalfOfArr {
    static void swap(int[] arr){
        int mid = arr.length/2;
        for(int i=0,j=mid-1;i<j;i++,j--){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        for(int i=mid,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        swap(arr);
    }
}
