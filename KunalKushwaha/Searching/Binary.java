public class Binary{
    static int bi(int[] arr,int val){
        int str=0;
        int end= arr.length-1;

         while(str<=end){
            int mid = (str+end)/2;

            if(arr[mid]==val){
                return mid;
            }

        // Checking Whether the input Array is Ascending Ordred Or Decending Ordered.

        // If Decending Ordered It will Execute.
        if(arr[str]>arr[end]){
           if(arr[mid]>val){
                str = mid+1;
           }
           if(arr[mid]<val){
                end = mid-1;
           }
        }

        // If Ascending Ordered It will Execute.
        else{
             if(arr[mid]>val){
                end=mid-1;
            }
            if(arr[mid]<val){
                str=mid+1;
            }           
        }
    }
       
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,3,7,8,9,18,31,45,63,93};
        int[] arr2 = {93,63,45,31,18,9,8,7,3,1};
        int val= 1;
        int result = bi(arr2,val);
        System.out.println(result);
    }
}