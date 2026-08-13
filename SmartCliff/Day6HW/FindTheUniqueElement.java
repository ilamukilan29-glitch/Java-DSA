package SmartCliff.Day6HW;
import java.util.Scanner;
// This Method is Valid Only The Array with Even Number of Dublicate Elements

public class FindTheUniqueElement {
    static int findUnique(int[] arr){
        int res =0;
        for(int ar:arr){
            res^=ar;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findUnique(arr));

    }
}
