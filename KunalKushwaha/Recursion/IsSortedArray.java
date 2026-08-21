package KunalKushwaha.Recursion;

public class IsSortedArray {
    static boolean isSort(int arr[], int str){
        if(str==arr.length-1){
            return true;
        }
        return (arr[str]<arr[str+1]) && isSort(arr,str+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9,11,18,31,33,45,63,93};
        System.out.println(isSort(arr,0));
    }
}
