package D2Arrays;
import java.util.Scanner;
public class PrintingDiagonals {
    //Printing the diagonals of a Matrix 
    /*
    For Main Diagonal we should use(i,i);
    for another diagonal we should check if(i+j)==n-1;
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Main Diagonal Values: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i][i]+" ");
        }
        System.out.println();
        System.out.print("Another Diagonal Values: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1)
                    System.out.print(arr[i][j]+" ");
            }
        }
    }
}
