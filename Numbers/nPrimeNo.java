import java.util.Scanner;


public class nPrimeNo {
    static boolean isPrime(int a){
        boolean res = true;
        int s = a/2;
        if(a<=1){
            return false;
        }
        else{
            for(int i = 2;i<=s;i++){
            if(a%i==0){
                return false;
            }
        }
        
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
    }
}
