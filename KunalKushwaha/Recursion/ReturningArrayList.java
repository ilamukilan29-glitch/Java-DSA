package KunalKushwaha.Recursion;
import java.util.*;
public class ReturningArrayList {
    static ArrayList<Integer> search(int[] arr,int t,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }if(arr[i]==t){
            list.add(i);
        }
        return search(arr,t,i+1,list);
    }
    // Creating new Arraylist<> for each funtioncall  and pass it Recursively.
    static ArrayList<Integer> search1(int[] arr,int t,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }if(arr[i]==t){
            list.add(i);
        }
        ArrayList<Integer> val = search1(arr, t, i+1);
        list.addAll(val);
        return list;
    }
    public static void main(String[] args) {
         int[] arr = {1,3,7,8,9,11,18,25,31,31,31,31,31,33,31,45,31,63,31,93,31};
         ArrayList<Integer> list = new ArrayList<>();
         search(arr,31,0,list);
         System.out.println(list.toString());
         System.out.println(search1(arr, 31, 0));
    }
}
