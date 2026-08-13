package KunalKushwaha.Sorting;
import java.util.Arrays;

public class MissingNoCyc {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        for(int i=0;i<arr.length;i++){
            int crn=arr[i];
            if(arr[i]!=i && arr[i]<arr.length){
                int tem=arr[i];
                arr[i]=arr[crn];
                arr[crn]=tem;
            }
        }
        System.out.println(Arrays.toString(arr));
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                res=i;
                break;
            }
        }
        if(res==-1){
            System.out.println(arr.length);
        }else{
            System.out.println(res);
        }
    }
}
