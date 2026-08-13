import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean aSmile = sc.nextBoolean();
        boolean bSmile = sc.nextBoolean();
        boolean res = !(aSmile^bSmile);
        System.out.print(res);

    }
}
