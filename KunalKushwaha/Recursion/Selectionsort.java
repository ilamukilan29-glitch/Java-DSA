package KunalKushwaha.Recursion;

import java.util.Arrays;

public class Selectionsort {
    static void sort(int arr[], int s,int e,int max){
        if(e==0){
            return;
        }
        if(s<=e){
            if(arr[s]>arr[max]){
                sort(arr, s+1, e, s);
            }else{
                sort(arr,s+1,e,max);
            }
        }else{
            int tem =arr[e];
            arr[e]=arr[max];
            arr[max]=tem;
            sort(arr,0,e-1,0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,6,7,5,4,3,2,1,0,6,4,3,4,5,6,7,3,2,1};
        sort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
