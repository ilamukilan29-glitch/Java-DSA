package KunalKushwaha.Recursion;

public class ReverseaNumber {
    static int rev(int n){
        //counting the number of digits
        int dig = (int) (Math.log10(n))+1;
        return helper(n,dig);
    }
    static int helper (int n, int dig){
        if(n<10){
            return n;
        }
        int rem = n%10;
        return rem *(int) Math.pow(10,dig-1) + helper(n/10,dig-1);
    }
    public static void main(String[] args){
         int n=1234567; 
         System.out.print(rev(n));
    }
}
 