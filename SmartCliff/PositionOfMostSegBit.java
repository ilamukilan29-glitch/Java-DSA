package SmartCliff;
import java.util.Scanner;

public class PositionOfMostSegBit {
    static void lowestHighestoneBit(int n){
        int res1=java.lang.Integer.highestOneBit(n);
        int res2=java.lang.Integer.lowestOneBit(n);
        int ress1=0,ress2=0;
        while(res1>0){
            res1/=2;
            ress1++;
        }
        while(res2>0){
            res2/=2;
            ress2++;
        }
        System.out.println("Highest Most BIT:"+ress1);
        System.out.println("Lowest Most BIT: "+ress2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        lowestHighestoneBit(n);
    }
}
