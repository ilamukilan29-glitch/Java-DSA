package KunalKushwaha.Backtracking;
import java.util.*;


public class MazeArrayList {
    static ArrayList<String> maze(int r, int c,String P){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }
         ArrayList<String> list= new ArrayList<>();
        if(r>1){
           list.addAll(maze(r-1, c, P+"R"));
        }
        if(c>1){
             list.addAll(maze(r, c-1, P+"D"));
        }
        return list;
    }
    public static void main(String[] args) {
       
        System.out.println(maze(3, 3, "").toString());
        
    }
}
