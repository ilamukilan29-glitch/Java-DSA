package KunalKushwaha.Sorting;
import java.util.Arrays;

public class Cyclesort {

    //Use CycleSort when the elements are range from 1 to N *
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int crt =arr[i]-1;
             if(i!=crt){
                int tem = arr[i];
                arr[i]=arr[crt];
                arr[crt]=tem;
             } 
        }
        return arr;
    } 
    public static void main(String[] args) {
        int[] var1 = {7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sort(var1)));
    }
}
