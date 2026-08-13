import java.util.Scanner;

public class Merge2Array {
    static void mergeArr(int n1,int n2,int[] arr1,int[] arr2){
        int[] res = new int[n1+n2];
        for(int i=0;i<n1;i++){
            res[i]=arr1[i];
        }
        for(int i=n1;i<n2+n1;i++){
            res[i]=arr2[i-n1];
        }
        for(int re:res){
            System.out.print(re+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();
        mergeArr(n1, n2, arr1, arr2);
    }
}
