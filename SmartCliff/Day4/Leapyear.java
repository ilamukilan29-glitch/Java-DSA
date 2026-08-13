package SmartCliff.Day4;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int a = sc.nextInt();
        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                 System.out.println("Leap Year");
            }
           
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
