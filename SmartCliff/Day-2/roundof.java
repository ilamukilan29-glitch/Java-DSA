import java.util.Scanner;
public class roundof {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int count=0;
        int d=10-(a%10);
        int e=10-(b%10);
        int f=10-(c%10);
        count+=((a%10)>4)?a+d:a-d;
        count+=(b%10>4)?e+(b):b-e;
        count+=(c%10>4)?f+(c):c-f;
        System.out.print(count);
    }
}
