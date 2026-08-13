package SmartCliff.Day4.Day5;
import java.util.Scanner;
public class InvertedAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                int re = 65+j;
                char cha = (char)re;
                System.out.print(cha+" ");
            }
            System.out.println();
        }
    }
}
