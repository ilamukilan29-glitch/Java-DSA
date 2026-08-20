package KunalKushwaha.Recursion;

public class sumofDigits {
    static int sumofdig(int n){
        if(n<10){
            return n;
        }
        return n%10+sumofdig(n/10);
    }
    public static void main(String[] arsg){
        int n=1231;
        System.out.print(sumofdig(n));
    }
}
