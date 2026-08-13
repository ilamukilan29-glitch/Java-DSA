import java.util.Scanner;
public abstract class SelectionSort {
    static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(isSorted(arr)){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
            sort(arr);
        }


    }
}
