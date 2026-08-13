import java.util.*;

public class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
                while(i<n-1 && arr[i]==arr[i+1]){
                    i++;
                }
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.print(arr[n-1]);
        }
    }
}
