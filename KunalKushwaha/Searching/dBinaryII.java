import java.util.Arrays;

public class dBinaryII{
    static int[] Binary(int[][] arr, int t){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        int row=arr.length;
        int col=arr[0].length;
        int rstr=0;
        int rend=row-1;
        int rows=-1;
        while(rstr<=rend){
            int mid = rstr+(rend-rstr)/2;
            if(arr[mid][0]<=t && arr[mid][col-1]>=t){
                rows=mid;
                break;
            }
            if(arr[mid][0]>t){
                rend=mid-1;
            }
            else if(arr[mid][col-1]<t){
                rstr=mid+1;
            }
        }
        if(rstr>rend){
            return new int[]{-1,-1};
        }
        int cstr=0;
        int cend=col-1;
        while(cstr<=cend){
            int mid = cstr+(cend-cstr)/2;
            if(arr[rows][mid]==t){
                return new int[]{rows,mid};
            }
            if(arr[rows][mid]<t){
                cstr=mid+1;
            }
            else{
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] var2 = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                                   {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 
                                   {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}, 
                                   {31, 32, 33, 34, 35, 36, 37, 38, 39, 40}, 
                                   {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, 
                                   {51, 52, 53, 54, 55, 56, 57, 58, 59, 60}, 
                                   {61, 62, 63, 64, 65, 66, 67, 68, 69, 70}, 
                                   {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}, 
                                   {81, 82, 83, 84, 85, 86, 87, 88, 89, 90}, 
                                   {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}};
        
        System.out.println(Arrays.toString(Binary(var2, 31)));
    }
}