public class Pivot {
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,0,1,2};
        int str=0;
        int end=arr.length-1;
        while(str<end){
            int mid = (str+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                str=mid+1;
            }
        }
        System.out.println(str);
    }
}
