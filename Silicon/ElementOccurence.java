import java.util.Scanner;
public class ElementOccurence {
    /*
    We have to find the Occurance of a element in the array,
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int val = sc.nextInt();
        int count=0;
        for(int ar:arr){
            if(ar==val)
                count++;
        }
        System.out.println(count);
    }
}
