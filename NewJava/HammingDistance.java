package NewJava;
import java.util.Scanner;
public class HammingDistance {
    static int FindHamming(int a, int b){
        int count=0;
        int c = a>b?a:b;
        for(int i=1;c>0;i++){
            if((a&1<<i)==(b&1<<i)){
                count++;
            }
            c=c>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = FindHamming(a, b);
        System.out.println(res);

    }
}
