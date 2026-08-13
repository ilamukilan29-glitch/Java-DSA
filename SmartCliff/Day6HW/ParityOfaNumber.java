package SmartCliff.Day6HW;
import java.util.Scanner;
public class ParityOfaNumber {
    static void oddOrEven(int n){
        int temp=n>>1;
        if((temp&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        oddOrEven(n);
    }
}
