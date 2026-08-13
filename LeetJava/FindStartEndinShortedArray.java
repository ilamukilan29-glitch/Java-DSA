import java.util.Scanner;

public class FindStartEndinShortedArray{
    static int[] search(int[] arr, int target){
        int[] res = {-1,-1};
        res[0] = Findstartend(arr, target, true);
        if(res[0]!=-1){
             res[1] = Findstartend(arr, target, false);
        }
        return res;
    }
    static int Findstartend(int[] arr, int target, boolean isStart){
        int res =-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                res=mid;
                if(isStart){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = new int[2];
         res = search(arr, target);
         System.out.println("Result: ");
         for(int re:res){
            System.out.println(re);
         }
    }
}