public class Celing{
    static int findCeling(int[] arr, int target){
        int str = 0;
        int end = arr.length-1;
        int cel = 0;
        while(str<end){
            int mid = str +(end-str)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
                
            }
            if(arr[mid]<target){
                str=mid+1;
                cel = mid;
             
            }
        }
    return cel+1;
    }
    public static void main(String[] args){
        int[] arr = {1,3,7,8,9,18,31,33,45,63,93};
        int target = 80;
        int Result = findCeling(arr,target);
        System.out.println(arr[Result]);
    }
}