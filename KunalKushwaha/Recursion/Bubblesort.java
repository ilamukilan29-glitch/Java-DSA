package KunalKushwaha.Recursion;

import java.util.Arrays;

public class Bubblesort {
    static void sort(int[] arr, int str,int end){
      if(end==0){
        return;
      }
      //check if the pointer before the sorted part of the array
      if(str<end){
        //do is util the condition fails
        if(arr[str]>arr[str+1]){
            int tem = arr[str];
            arr[str]=arr[str+1];
            arr[str+1]=tem;
        }
        sort(arr, str+1, end);
      }else{
        // if it fails current 1 more element sorted at the last index so end-1;
        sort(arr, 0, end-1);
      }
    }
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
