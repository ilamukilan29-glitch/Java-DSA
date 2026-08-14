
public class BinarySearchUsingRecursion{
    /*
         --Same BinarySearch Using Recursion--  
    */
   static int Search(int[] arr,int t,int str,int end){
        if(str>end){
            return -1;
        }
        int mid=str+(end-str)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(arr[mid]<t){
            return Search(arr,t,mid+1,end);
        }
        return Search(arr,t,str,mid-1);

   }
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8,9, 10, 12, 18, 23,31, 45,63,93};
        System.out.println(Search(arr, 31, 0, arr.length));
    }
}
