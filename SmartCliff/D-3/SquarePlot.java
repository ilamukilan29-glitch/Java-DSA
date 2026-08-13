import java.util.Scanner;

public class SquarePlot {
    static boolean isPrefectSquare(int a){
        double sqrt = Math.sqrt(a);
        for(int i=1;i<=sqrt;i++){
            if(i*i==a){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No of Plots ");
        int n=sc.nextInt();
        System.out.println("Enter the plot Areas: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int ar:arr){
            
            if(isPrefectSquare(ar)){
                count++;
            }
           
        }
 System.out.println(count);
    }
}
