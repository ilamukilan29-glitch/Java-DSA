package NewJava;
import java.util.Scanner;

public class Setbit {
    static int deciToBi(int n){
        int res=0;
        int tem =n;
        while(n>0){
            int temp = n%2;
            res=res*10+temp;
            n/=2;
        }
        if(tem%2==0){
            res=res*10+0;
        }
        return countSetBit(res);
    }
    static int countSetBit(int n){
        int count =0;
        while(n>0){
            int temp = n%10;
            count+=temp;
            n/=10;
        }
        return count;
    }
    static boolean isBinary(int n){
        while(n>0){
            int temp =n%10;
            if(temp>1){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }else if(isBinary(n)){
            System.out.println("Invalid Input");
        }else{
            System.out.println(deciToBi(n));
        }
        
    }
}
