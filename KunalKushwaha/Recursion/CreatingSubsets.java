package KunalKushwaha.Recursion;
import java.util.*;
public class CreatingSubsets {
    static void subsets(String p, String up){
        // 
        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.print(p+" ");
            }
            return;
        }
        char ch = up.charAt(0);
        // adding character 
        subsets(p+ch, up.substring(1));
        // Skipping character
        subsets(p, up.substring(1));
    }
     static ArrayList<String> subsetslist(String p, String up){
        
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }
        char ch = up.charAt(0);
        // adding character 
        ArrayList<String> left = subsetslist(p+ch, up.substring(1));
        // Skipping character
        ArrayList<String> right =subsetslist(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        subsets("","abc");
        System.out.println();
        System.out.println(subsetslist("", "abc").toString());
    }
}
