package KunalKushwaha.Sorting;
public class BubbleSort {
    static int[] sort(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            boolean count=true;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int tem = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tem;
                    count=false;
                }
            }
            if(count){
                break;
            }
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
