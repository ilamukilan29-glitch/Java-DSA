package SmartCliff.Day4;
import java.util.Scanner;

public class sums {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int sum =0;
        if(n>1){
           for(int i=1;i<=n;i++){
            sum+=i;
           }
           System.out.println(sum);
        }
        else{
            System.out.println("Enter a Positive Number!!");
        }
    }
}
