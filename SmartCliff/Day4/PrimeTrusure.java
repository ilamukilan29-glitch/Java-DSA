package SmartCliff.Day4;
import java.util.Scanner;

public class PrimeTrusure {
    static boolean isPrime(int a){
         if(a>1){
            for(int i =2;i<=a/2;i++){
                if(a%i==0){
                    return false;
                }
            }

            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean res=isPrime(a);
       if(res){
        System.out.println("Gates Open");
       }
       else{
        System.out.println("Try Another Way");
       }
    }
}
