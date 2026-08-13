package SmartCliff.Day6HW;
import java.util.Scanner;
public class CountSetBits {
    static int noOfSetBits(int n){
        int count=0;
        for(int i=1;i<=32;i++){
            int temp = (n>>i)&1;
            if(temp==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(noOfSetBits(n));
    }
}
