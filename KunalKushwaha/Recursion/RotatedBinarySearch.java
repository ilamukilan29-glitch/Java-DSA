package KunalKushwaha.Recursion;

public class RotatedBinarySearch {
    static int search(int[] arr,int t, int str,int end){
        if(end<str){
            return -1;
        }
        int mid = str+(end-str)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(arr[mid]>t){
           return search(arr,t,str,mid-1);
        }
        return search(arr,t,mid+1,end);
    }
    static int pivot(int[] arr,int str,int end){
        if(str>end){
            return -1;
        }
        int mid = str+(end-str)/2;

        if(mid!=arr.length-1 && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid!=0 && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[mid]<arr[str]){
            return pivot(arr,str,mid-1);
        }
        return pivot(arr,mid+1,end);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int t = 10;
        int pi=pivot(arr, 0, arr.length-1);

        int res=search(arr, t, 0, pi);
        if(res==-1){
            res=search(arr,t, pi+1, arr.length-1);
        }
        System.out.println(res);
        
    }
}
