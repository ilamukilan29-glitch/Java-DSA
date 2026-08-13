package NewJava;
import java.util.Scanner;
public class Compliment{
    static int ComplimentOfDeciToBinary(int n){
        int[] res= new int[32];
        int place =0;
        while(n>0){
            int temp =n%2;
            if(temp==0){
                res[place] =1;
            }else{
                res[place]=0;
            }
            place++;
            n/=2;
        }
        return BinaryToDeci(res);
    }
    static int pow(int base,int poww){
        int res=1;
        for(int i=0;i<poww;i++){
            res*=base;
        }
        return res;
    }
    static int BinaryToDeci(int[] arr){
        int res =0;
        int dig=0;
        int place = 0;
        while(place<32){
            int temp = arr[place];
            res=res+temp*pow(2, dig);
            dig++;
            place++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ComplimentOfDeciToBinary(n));
    }
}