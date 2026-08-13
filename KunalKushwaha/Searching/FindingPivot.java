import java.util.Scanner;

public class FindingPivot {
    static int findpivot(int[] arr){
        int str=0;
        int end = arr.length-1;
        while(str<=end){
            int mid = str+(end-str)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>str && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(mid>str){
                str=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={5,6,7,8,9,10,11,12,13,1,2,3,4};
        System.out.println(findpivot(arr));
    }
}
