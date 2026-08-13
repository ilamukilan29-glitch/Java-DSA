import java.util.Scanner;
public class PrimeFinder {
    static boolean isPrime(int a){
        if(a<2 || a%2==0){
            return false;
        }
        
        for(int i=2;i<=a/2;i++){
           
         if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the No 2: ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i==2){
                System.out.print(i+" ");
            }

            if(isPrime(i)){
                if(isPrime(2*i+1)){
                    System.out.print(i+ " ");
                }
            }
        }
    }
}
