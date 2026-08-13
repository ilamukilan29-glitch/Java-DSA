package NewJava;
import java.util.Scanner;
public class RightMostBit {
    static int rightmost(int n){
        return n&-n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rightmost(n));

    }
}
