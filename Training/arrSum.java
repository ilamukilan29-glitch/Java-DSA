package Training;

import java.util.Scanner;

public class arrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        float[] arr2 = new float[10];
        float sum=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            arr2[i]=sc.nextFloat();
        }
        for(int i=0;i<10;i++){
            sum+=arr[i]+arr2[i];
        }
        System.out.println(sum);


    }
}
