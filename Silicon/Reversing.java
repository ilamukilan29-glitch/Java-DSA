import java.util.Scanner;

public class Reversing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        while(num>0){
            int temp = num%10;
            res= res*10+temp;
            num/=10;
        }
        System.out.println(res);
    }
}
