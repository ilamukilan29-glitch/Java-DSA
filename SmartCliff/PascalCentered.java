package SmartCliff;
import java.util.Scanner;

public class PascalCentered{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1]; 
        arr[0]=1;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print(" ");
            }
               for(int j=0;j<=i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            for(int j=i+1;j>0;j--){
                arr[j]=arr[j]+arr[j-1];
            }
        }
    }
}