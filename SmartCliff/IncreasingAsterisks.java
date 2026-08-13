package SmartCliff;
import java.util.Scanner;

public class IncreasingAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int inc = i+(i-1);
            for(int j=1;j<=inc;j++){
                if (j==i) {
                    System.out.print(i);
                }
                else{
                     System.out.print("* ");
                }
               
            }
            System.out.println();
        }
    }
}
