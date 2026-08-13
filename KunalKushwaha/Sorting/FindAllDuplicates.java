package KunalKushwaha.Sorting;
public class FindAllDuplicates {
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    static int[] sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int crt = arr[i]-1;
            if(arr[i]!=arr[crt]){
                int tem=arr[i];
                arr[i]=arr[crt];
                arr[crt]=tem;
            }else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        int[] res=sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
