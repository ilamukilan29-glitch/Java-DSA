package NewJava;
import java.util.Scanner;
public class ChangeAllEvenBitsTo0 {
    static int[] DeciToBinary(int n){
        int[] res = new int[32];
        int place =0;
        while(n>0){
            int temp = n%2;
            res[place] = temp;
            place++;
            n/=2;
        }
        return SetEvenTo0(res);
    }
    static int[] SetEvenTo0(int[] n){
       for(int i=0;i<n.length;i++){
        if(i%2==0){
            n[i]=0;
        }
       }
        return n;
    }
    static int pow(int base,int po){
        int res=1;
        for(int i=0;i<po;i++){
            res*=base;
        }
        return res;
    }
    static int BinaryToDeci(int[] n){
        int num =0;
        int power =0;
        for(int i=0;i<n.length;i++){
            int temp=n[i];
            num+=temp*pow(2,power);
            power++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Invalid Input");
        }else{
        int[] Binary = DeciToBinary(n);
        int Result = BinaryToDeci(Binary);
        System.out.println(Result);
        }
    }
}
