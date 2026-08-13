import java.util.Scanner;
public class Party {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tea, Candy: ");
        int tea = sc.nextInt();
        int candy = sc.nextInt();
        int res = (5>tea||candy<5)?0:((tea>=candy*2)||(tea*2<=candy))?2:1;
        System.out.print(res);
    }
}
