package SmartCliff.Day4;
import java.util.Scanner;
public class palind {
    static int revs(int a){
        int rev =0;
        while(a>0){
            int temp = a%10;
            rev = (rev*10)+temp;
            a/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = revs(a);
        if(res ==a){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
