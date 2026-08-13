import java.util.Scanner;
public class choco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No of Small");
        int s = sc.nextInt();
        System.out.println("Enter the No of Large");
        int l = sc.nextInt();
        System.out.println("Enter The Goal Value");
        int g = sc.nextInt();

        int tot = s+l*5;
        int req = g-(l*5);
        int res = (req<s)?s-req:(req==s)?s:(req>s)?req-s:0;
        System.out.print(res);

    }
}
