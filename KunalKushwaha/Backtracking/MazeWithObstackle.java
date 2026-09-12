package KunalKushwaha.Backtracking;

public class MazeWithObstackle{
    static void mazee(int r, int c, boolean[][] maze,String P){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(P);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            mazee(r+1, c, maze, P+"R");
        }
        if(c<maze[0].length-1){
            mazee(r, c+1, maze, P+"D");
        }
    }
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};
        mazee(0, 0, maze, "");
    }
}