package KunalKushwaha.Sorting;

import java.util.Arrays;
// This is the poor version on merge sort bcz it creates new object for every recursive call and the original array remains the same.
public class Mergesort {
    // Here we are doing the merge process by comparing the element of both sorted arrays
    static int[] merge(int[] first, int[] second){
        int[] mer = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mer[k]=first[i];
                i++;
            }else{
                mer[k]=second[j];
                j++;
            }
            k++;
        }
        // In case we have completly traverse one array but another one have some elements so we traverse that also. 
        while(i<first.length){
            mer[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mer[k]=second[j];
            j++;
            k++;
        }
        return mer;
    }
    static int[] sort(int[] arr){
        // Its a recusive process by repedeted divide the array until it becomes a single element 
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        // divide it through mid and recusively call the same function repetedly call it until become a single element
        int[] one = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] two = sort(Arrays.copyOfRange(arr, mid, arr.length));
        // finally merge those array and return them
        return merge(one,two);
    }
    public static void main(String[] args) {
        int[] arr = {1,7,3,25,33,18,45,31,99,63,93,9,11};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
