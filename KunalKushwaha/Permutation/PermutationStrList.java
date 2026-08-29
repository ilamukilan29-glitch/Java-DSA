package KunalKushwaha.Permutation;
import java.util.*;

public class PermutationStrList {
    // Returning the Possibilites of a String in a ArrayList
    static ArrayList<ArrayList<String>> per(String up, String p){
        if(up.isEmpty()){
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            ArrayList<String> lst=new ArrayList<>();
            lst.add(p);
            list.add(lst);
            return list;

        }
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            list.addAll(per(up.substring(1), f+ch+s));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(per("abc", "").toString());
    }
}
