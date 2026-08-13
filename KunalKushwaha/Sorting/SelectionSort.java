package KunalKushwaha.Sorting;
public class SelectionSort{
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int mini=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[mini];
            arr[mini]=tem;
        }
        return arr;
    }
    public static void main(String[] args) {
          int[] arr = {5,4,3,2,1,4,7,4,4,3,3,3,5,6,6};
        int[] res = sort(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
