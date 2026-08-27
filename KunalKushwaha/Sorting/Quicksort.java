package KunalKushwaha.Sorting;

import java.util.Arrays;

public class Quicksort {
    static void sort(int[] arr, int low, int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int tem = arr[s];
                arr[s]=arr[e];
                arr[e]=tem;
                s++;
                e--;
            } 
        }
        // Now we fit the Pivot at the correct  positon, and break the array into halves
        sort(arr,low,e);
        sort(arr,s,hi);
    }
    public static void main(String[] args) {
        int[] arr ={1,3,8,9,7,11,33,31,45,63,18,93};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
