package SmartCliff;
import java.util.Scanner;

public class Nearestsquare {
     static boolean isPrefectSquare(int a){
        double sqrt = Math.sqrt(a);
        for(int i=1;i<=sqrt;i++){
            if(i*i==a){
                return true;
            }
        }
        return false;
    }
    static int nearestSquare(int n){
        int res=0;
       for(int i=n+1;i<=n*n;i++){
        if(isPrefectSquare(i)){
            return i;
        }
       }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nearestSquare(n));

    }
}
