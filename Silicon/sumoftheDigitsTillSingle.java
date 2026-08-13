import java.util.*;

public class sumoftheDigitsTillSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n%9;
        if(res==0){
            System.out.println(9);
        }else{
            System.out.println(res);
        }
    }
}
