
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dub = n;
        int og=0;
        while(n>0){
            int temp = n%10;
            og= og*10+temp;
            n=n/10;
        }
        if(og==dub){
            System.out.println("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }    

}
