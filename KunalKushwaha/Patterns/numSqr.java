package KunalKushwaha.Patterns;
import java.util.Scanner;
public class numSqr {
    public static void main(String[] args) {

        /*
        n=5
        OutPut:
                    0 0 0 0 0 0 0 0 0 0 0 
                    0 1 1 1 1 1 1 1 1 1 0 
                    0 1 2 2 2 2 2 2 2 1 0 
                    0 1 2 3 3 3 3 3 2 1 0 
                    0 1 2 3 4 4 4 3 2 1 0 
                    0 1 2 3 4 5 4 3 2 1 0 
                    0 1 2 3 4 4 4 3 2 1 0 
                    0 1 2 3 3 3 3 3 2 1 0 
                    0 1 2 2 2 2 2 2 2 1 0 
                    0 1 1 1 1 1 1 1 1 1 0 
                    0 0 0 0 0 0 0 0 0 0 0 
        */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        n=n*2;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int val=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
