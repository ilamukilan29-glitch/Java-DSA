package NewJava;
import java.util.Scanner;

public class BinaryToDecimal {
    static int power(int base, int po){
        int res=1;
        for(int i=0;i<po;i++){
            res*=base;
        }
        return res;
    }
    static int biToDeci(int n){
        int Deci=0;
        int pow=0;
        while(n>0){
            int temp =n%10;
            Deci+= temp* power(2,pow);
            pow++;
            n/=10;

        }
        return Deci;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        if(count<16){
             System.out.println(biToDeci(n));
        }else{
            System.out.println("Invalid Input");
        }
       
        
        
    }
}
