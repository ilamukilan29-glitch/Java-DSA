package KunalKushwaha.Recursion;

public class ProductsOfDigits {
    static int prod(int n){
        if(n<10){
            return n;
        }
        return (n%10)*prod(n/10);
    }
    public static void main(String[] args){
        int n=1234;
        System.out.print(prod(n));

    }
}
