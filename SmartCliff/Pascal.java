package SmartCliff;
import java.util.Scanner;

public class Pascal {
    static int[][] pascal(int n ){
        int[][] arr = new int[n][];
        int val=1;
        for(int i=0;i<n;i++){
            arr[i] = new int[val];
            for(int j=0;j<val;j++){
                if(j==0 || j==val-1){
                    arr[i][j]=1;
                }else{
                    int temp = arr[i-1][j] + arr[i-1][j-1];
                    arr[i][j]=temp;
                }
            }
            val++;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res=pascal(n);
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<val;j++){
                System.out.print(res[i][j]);
            }
            val++;
            System.err.println();
        }
    }
}
