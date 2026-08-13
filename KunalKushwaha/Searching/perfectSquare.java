import java.util.Scanner;

public class perfectSquare {
    static boolean isPerfect(int a){
        double sqrt = Math.sqrt(a);
        for(int i=1;i<=sqrt;i++){
            if(i*i==a){
                return true;
            }
        }
        
       
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean res = isPerfect(a);
        System.out.print(res);

    }
}
