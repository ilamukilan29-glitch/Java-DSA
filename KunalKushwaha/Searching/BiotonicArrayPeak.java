import java.util.Scanner;

public class BiotonicArrayPeak {
    // Biotonic Array is an array which is like a mountain in the starting the value is in increasing order at a particular peak position it gets decreasing order
    static int mountPeak(int[] arr){
        int str =0;
        int end = arr.length-1;
        while(str<end){
            int mid = str+(end-str)/2;
            if(arr[mid]<arr[mid+1]){
                str=mid+1;
            }
            else{
                end =mid;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(mountPeak(arr));
        
    }
}
