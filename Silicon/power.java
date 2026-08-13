import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Base = sc.nextInt();
        int pow = sc.nextInt();
        int res = 1;
        if(pow==0){
            System.out.println(1);
            return;
        }
        for(int i=1;i<=pow;i++){
            res*=Base;
        }
        System.out.println(res);

    }
}
