package SmartCliff.Day4.Day5;
import java.util.Scanner;
public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int tem = 65+j;
                char cha = (char)tem;
                System.out.print(cha+" ");
            }
            System.out.println();
        }   
    }
}
