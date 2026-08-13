package SmartCliff;
import java.util.Scanner;

public class basic{
    static String oddoreven(int a){
        if(a%2 == 0){
            return ("Even");
        }
        else{
            return("odd");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        int d = a+b;
        System.out.println(d);
        System.out.println(c);
        String ress = oddoreven(a);
        System.out.print(ress);


    }
}