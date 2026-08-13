package SmartCliff.Day4.Day5;
import java.util.Scanner;
public class AlphabetMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr = new char[n][n];
        int val =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp = 65+val;
                arr[i][j] = (char) temp;
                val++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
