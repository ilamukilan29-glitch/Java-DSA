import java.util.Scanner;
public class SecondMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,7,8,3,4,1,6,5};
        int min=arr[0];
        int min2=arr[0];
        for(int i=1;i<8;i++){
            if(min>arr[i]){
                min2=min;
                min=arr[i];
            }

        }
        System.out.println(min2);
    }
}
