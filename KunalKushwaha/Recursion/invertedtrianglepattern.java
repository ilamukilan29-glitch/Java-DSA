package KunalKushwaha.Recursion;

public class invertedtrianglepattern {
    static void dopattern(int n){
        if(n<0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        dopattern(n-1);
    }
    public static void main(String[] args) {
        int n =7;
        dopattern(n);
    }
}
