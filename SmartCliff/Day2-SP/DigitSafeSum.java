import java.util.Scanner;

public class DigitSafeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b: ");
        int a= sc.nextInt();
        int d=a;
        int b= sc.nextInt();
        int e=b;
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        int c = a+b;
        int count1=0;
        while(c>0){
            count1++;
            c/=10;
        }
        int res= (count>count1)?d:d+e;
        System.out.print(res);
    }
}
