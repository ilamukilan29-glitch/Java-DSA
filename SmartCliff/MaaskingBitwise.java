package SmartCliff;
import java.util.Scanner;

public class MaaskingBitwise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =1;
        for(int i=1;i<=4;i++){
            System.out.println(n);
            n=n|1<<i;
        }

    }
}