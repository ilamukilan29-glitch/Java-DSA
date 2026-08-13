import java.util.Scanner;

public class PrimeRangeCounter {
    static boolean isPrime(int a){
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter L and R: ");
        int min=sc.nextInt();
        int max=sc.nextInt();
        int count=0;
        for(int i=min+1;i<max;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);

    
    }
}
