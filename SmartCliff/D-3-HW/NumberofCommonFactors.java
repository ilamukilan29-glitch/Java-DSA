import java.util.Scanner;

public class NumberofCommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count =0;
        int c = (a>b)?a:b;
        for(int i=1;i<=c;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
