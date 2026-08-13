package NewJava;
import java.util.Scanner;
// Without Using Arithimetic Operators
public class SumofTwonums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            for(int i=0;i<b;i++){
                a++;
                
            }System.out.println(a);
        }else{
            for(int i=0;i<a;i++){
                b++;
              
            }  System.out.println(b);
        }
        
    }
}
