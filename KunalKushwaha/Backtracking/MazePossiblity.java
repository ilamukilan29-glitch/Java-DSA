package KunalKushwaha.Backtracking;

public class MazePossiblity {
     static void maze1(int r,int c, String P){
        if(r==1 && c==1){
            System.out.println(P);
        }
        if(r>1){
            maze1(r-1, c, P+"R");
        }
        if(c>1){
            maze1(r, c-1, P+"D");
        }
    }

    static int maze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right= maze(r-1, c);
        int down= maze(r,c-1);
        return  right+down;
       
    }
    public static void main(String[] args) {
        // System.out.println(maze(3, 3));
        maze1(3, 3, "");
    }
}
