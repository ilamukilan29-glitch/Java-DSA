class uniqueApperanceOfArray{
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,6,5,4,3,2,1};
         int val=0;
         for(int i=0;i<arr.length;i++){
            val^=arr[i];
         }
         System.out.println(val);
    }
}