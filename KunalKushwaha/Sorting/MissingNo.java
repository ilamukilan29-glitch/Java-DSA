package KunalKushwaha.Sorting;
import java.util.*;
public class MissingNo {
    public static void main(String[] args) {
         int[] arr={0,2,5,3,1,4};
         Arrays.sort(arr);
         int res=arr.length;
         for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                res=i;
                break;
            }
         }
         System.out.print(res);
    } 
}
