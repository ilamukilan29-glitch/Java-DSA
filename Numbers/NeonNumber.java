import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n*n;
        int sum=0;
        while(sqr>0){
            int temp = sqr%10;
            sum+=temp;
            sqr/=10;
        }
        if(n==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}
