import java.util.Scanner;

public class BinarySearchIn2dArray {
    static int[] find(int[][] arr,int target){
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                res[0]=r;
                res[1]=c;
                return res;
            }
            if(arr[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
                         { 1,  2,  3,  4,  5,  6,  7,  8,  9, 10 },
                         { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
                         { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
                         { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
                         { 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 },
                         { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 },
                         { 61, 62, 63, 64, 65, 66, 67, 68, 69, 70 },
                         { 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 },
                         { 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 },
                         { 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 }
                        };
        int[] res=find(arr,31);
        System.out.println(res[0]+","+res[1]);
    }
}
