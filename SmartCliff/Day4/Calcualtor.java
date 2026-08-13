package SmartCliff.Day4;
import java.util.Scanner;

public class Calcualtor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter The Operation +, -, *, /");
        char o = sc.nextLine().charAt(0);
        switch (o) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b==0){
                    System.out.println("Error: Divided By Zero Not Allowed");
                }
                else{
                    System.out.println(a/b);
                }
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
