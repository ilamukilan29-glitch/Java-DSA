import java.util.Scanner;
7
public class ClimateToday {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter minRange");
        int min = sc.nextInt();
        System.out.println("Enter MaxRange:");
        int max = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int ar:arr){
            if(ar<min || ar>max){
                System.out.print(ar+" ");
            }
        }
    }
}