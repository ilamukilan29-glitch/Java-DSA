import java.util.Scanner;

public class PenSwitch {
//     Problem Statement: You are a teacher creating an engaging 
// math activity for your students by writing N numbers on the 
// classroom whiteboard. You use a green pen for odd numbers and 
// a red pen for even numbers. Your task is to find and return an 
// integer value representing the number of times you need to switch 
// from the green pen to the red pen while writing these numbers. 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]%2==0&&arr[i-1]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}

[["5","3","." ,".","7",".", ".",".","."]
,["6",".","." ,"1","9","5", ".",".","."]
,[".","9","8" ,".",".",".", ".","6","."]
,["8",".","." ,".","6",".",  ".",".","3"]
,["4",".","." ,"8",".","3",  ".",".","1"]
,["7",".","." ,".","2",".",  ".",".","6"]
,[".","6","." ,".",".",".",  "2","8","."]
,[".",".","." ,"4","1","9",  ".",".","5"]
,[".",".","." ,".","8",".",  ".","7","9"]]
