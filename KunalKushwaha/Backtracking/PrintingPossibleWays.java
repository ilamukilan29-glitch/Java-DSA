package KunalKushwaha.Backtracking;
import java.util.*;

public class PrintingPossibleWays {
    static void maze(int r,int c, String P){

        if(r==1){
            if(P.length()==2){
                P+="DD";
            }else{
                P+="D";
            }
            System.out.println(P);
            return;
        }
        if(c==1){
            if(P.length()==2){
                P+="RR";
            }else{
                P+="R";
            }
            System.out.println(P);
            return;
        }
        maze(r-1,c,P+"R");
        maze(r,c-1,P+"D");
    }
    public static void main(String[] args) {
        maze(3, 3, "");
    }
}
