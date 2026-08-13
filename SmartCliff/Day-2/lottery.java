import java.util.Scanner;
public class lottery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int res=(a==b)&&(a==c)&&(b==c)?20:(a==b)||(a==c)||(b==c)?10:0;
        System.out.print(res);
    }
}
