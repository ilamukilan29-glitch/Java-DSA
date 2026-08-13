package KunalKushwaha.Sorting;
import java.util.Arrays;

public class AllMissingNo {
        static int[] sort(int[] arr){
            int i=0;
            while(i<arr.length){
                int crt = arr[i]-1;
                if(arr[crt]!=arr[i]){
                    int tem=arr[i];
                    arr[i]=arr[crt];
                    arr[crt]=tem;
                }
                else{
                    i++;
                }
            }
            return arr;
        }
       public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] res= sort(arr);
        for(int i=0;i<res.length;i++){
            if(i!=res[i]-1){
                System.out.print(i+1+" ");
            }
        }
        System.out.println(Arrays.toString(sort(arr)));
       }
}
