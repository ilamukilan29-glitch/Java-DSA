package KunalKushwaha.Recursion;

public class LinerarSearch {
    static int search(int[] arr,int t,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==t){
            return index;
        }
        return search(arr,t,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9,11,18,25,31,33,45,63,93};
        int t=31;
        System.out.println(search(arr,t,0));
    }
}
