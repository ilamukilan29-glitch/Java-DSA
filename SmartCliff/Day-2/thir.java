import java.util.Scanner;
public class thir {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = (b==13)?a:(c==13)?a+b:a+b+c;
        System.out.print(res);
    }
}
