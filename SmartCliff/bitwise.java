package SmartCliff;
import java.util.Scanner;
public class bitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a&1)==1){
            System.out.print("Odd");
        }
        else{
            System.out.print("Even");
        }
    }
}
