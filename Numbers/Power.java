import java.util.Scanner;

public class Power {
    static int pow(int base,int power){
        int val = 1;
        for(int i=1;i<=power;i++){
            val*=base;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pow(n,2));
    }
}
