package KunalKushwaha.Recursion;
import java.util.*;

public class MultipleOccurenceInArray {
    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr, int t, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==t){
            list.add(index);
        }
         search(arr,t,index+1);
    }
    public static void main(String[] args){
        int arr[] = {1,3,7,8,9,11,18,25,31,33,45,31,31,31,31,31,63,93};
        search(arr,31,0);
        System.out.println(list.toString());

    }
}
