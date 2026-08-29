package KunalKushwaha.Permutation;
import java.util.*;

public class SubArrays {
    // Creating SubArrays as a List Using Iterative Method
    static ArrayList<ArrayList<Integer>> subArray(int[] arr){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int ar:arr){
            int n = res.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> list = new ArrayList<>(res.get(i));
               
                list.add(ar);
                if(!res.contains(list)){
                    res.add(list);
                }
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int[] n = {1,2,3};
        System.out.println(subArray(n).toString());
    }
}
