package KunalKushwaha.Recursion;

public class CountZeros {
    static int count(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return count(n/10,count);
    }
    public static void main(String[] args) {
        int n = 100000001;
        System.out.println(count(n,0));
    }
}
