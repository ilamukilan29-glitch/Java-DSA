import java.util.Scanner;
public class maxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();
        arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int max2 = 0;
        for(int ar : arr){
            if(ar > max){
                max =ar;
            }
            if(ar<min){
                min = ar;
            }
        }
        for(int ar: arr){
            if(ar<max && ar > min){
                if(max2<ar){
                    max2=ar;
                }
            }
        }
        System.out.println("Max = " + max);
        System.out.println("2 Max " + max2);
        System.out.print("Min = " + min);
    }
}
