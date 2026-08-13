package SmartCliff;
import java.util.Scanner;

public class nextPowerOf2 {
    static int nextpos(int n){
        n|=n>>1;
        n|=n>>2;
        n|=n>>4;
        n|=n>>8;
        n|=n>>16;

        return n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nextpos(n));
    }
}
