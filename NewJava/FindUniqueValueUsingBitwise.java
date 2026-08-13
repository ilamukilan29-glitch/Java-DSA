package NewJava;
public class FindUniqueValueUsingBitwise {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5,5,7,5,5};
        int u=0;
    for(int ar:arr){
        u^=ar;
    }
    System.out.println(u);
    }
    

}
