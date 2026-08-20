package KunalKushwaha.NumberSys;

public class GCD {
    // Euclidean Algorithm for Finding GCD
    // gcd(a,b)=gcd(b%a,a);
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        //using recursion for find the gcd
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.print(gcd(a,b));
    }
}
