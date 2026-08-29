package KunalKushwaha.Permutation;

public class PermutationStr {
    // Just printing the Possibilities of Arranging a String  --  Permutation
    static void per(String up,String p){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            per(up.substring(1), f+ch+s);
        }
    }
    public static void main(String[] args) {
        per("abc","");   
    }
}
