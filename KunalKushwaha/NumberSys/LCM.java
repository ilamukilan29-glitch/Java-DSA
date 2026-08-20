package KunalKushwaha.NumberSys;

public class LCM {
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        int a=12,b=30;
        System.out.println(lcm(a, b));
    }     
}
