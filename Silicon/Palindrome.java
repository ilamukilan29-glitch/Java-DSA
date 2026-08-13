import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Onum = num;
        int rev = 0;
        while(num>0){
            int temp = num%10;
            rev = rev*10+temp;
            num/=10;
        }
        if(rev==Onum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}