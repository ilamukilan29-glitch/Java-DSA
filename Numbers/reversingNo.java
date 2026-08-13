import java.util.Scanner;

public class reversingNo{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev =0;

        while(N>0){
            int temp = N%10;
            rev = rev*10+temp;
            N /=10;
        }
        System.out.println(rev);
        sc.close();
    }
}