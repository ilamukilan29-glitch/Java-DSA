import java.util.*;
public class KthLargestInArr {
    static int kthlargest(int n,int[] arr,int k){
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int k = sc.nextInt();
        System.out.println(kthlargest(n, arr, k));
    }
}
