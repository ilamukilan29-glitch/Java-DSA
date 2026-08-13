package KunalKushwaha.Patterns;
import java.util.Scanner;

public class numSqrII {

    /*
    n=5
    Output:
            5 5 5 5 5 5 5 5 5 5 5 
            5 4 4 4 4 4 4 4 4 4 5 
            5 4 3 3 3 3 3 3 3 4 5 
            5 4 3 2 2 2 2 2 3 4 5 
            5 4 3 2 1 1 1 2 3 4 5 
            5 4 3 2 1 0 1 2 3 4 5 
            5 4 3 2 1 1 1 2 3 4 5 
            5 4 3 2 2 2 2 2 3 4 5 
            5 4 3 3 3 3 3 3 3 4 5 
            5 4 4 4 4 4 4 4 4 4 5 
            5 5 5 5 5 5 5 5 5 5 5 
    */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ogn=n;
        n=n*2;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int val=ogn-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
