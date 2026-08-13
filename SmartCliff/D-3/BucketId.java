import java.util.Scanner;

public class BucketId {
    static int bucketno(int a){
        int sum=0;
        while(a>0){
            int tem = a%10;
            sum +=tem;
            a/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res = new int[n];
        int i=0;
        for(int ar:arr){
            res[i] = bucketno(ar);
            i++;
        }
        for(int re:res){
            System.out.println(re);
        }
    }
}
