package D2Arrays;
import java.util.Scanner;
public class ReverseRowsColmns{
    /*
    For Printing Reversing RowsofArray, we should run the inner loop from n-1 to 0;
    1 2 3      3 2 1
    4 5 6  ->  6 5 4
    7 8 9      9 8 7
    For Printing Reversing ColumnOf Array, we should run the outer loop from n-1 to 0;
    1 2 3      7 8 9
    4 5 6  ->  4 5 6
    7 8 9      1 2 3
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Reversing Column Of Matrix
        System.out.println("Column Reversing: ");
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Reversing Rows Of Matrix
        System.out.println("Rows Reversing: ");
        System.out.println();
         for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}