package D2Arrays;
import java.util.Scanner;
public class Rotate90And180 {
    public static void main(String[] args) {
        /*
        Rotating 90-Degree,
        1 2 3      7 4 1
        4 5 6  ->  8 5 2
        7 8 9      9 6 3 
        Rotating 180-Degree,
        1 2 3      9 8 7
        4 5 6  ->  6 5 4
        7 8 9      3 2 1
        */
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[][] arr = new int[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       System.out.println("Rotating to 90_Degree");
       //Rotating 90-Degree
       for(int i=0;i<n;i++){
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j][i]+" ");
        }
        System.out.println();
       }
       System.out.println("Rotating to 180_Degree");
       //Rotating 180_Degree
       for(int i=n-1;i>=0;i--){
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}
