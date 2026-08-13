import java.util.Scanner;

public class fibonace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int s = 1;

        for(int i=1;i<=n;i++){
            int temp = f;
            f += s;
            s = temp; 
            System.out.println(s);
        }
    }
}