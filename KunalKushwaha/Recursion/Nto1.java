package KunalKushwaha.Recursion;

public class Nto1 {
    static void printtill1(int n){
        if(n==0){
           return; 
        }
        // print the n and wating in the Stack
        System.out.print(n+" ");
        printtill1(n-1);
    }
    static void printtillN(int n){
        if(n==0){
            return;
        }
        // waiting in the stack for others and then prints the value;
        printtillN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        printtill1(n);
        System.out.println();
        printtillN(n);
    }
}
