package Training;

import java.util.Scanner;

public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0;i<10;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            arr2[i]=sc.nextInt();
        }
        int oddsum=0;
        int primesum=0;
        float oddavg=0;
        float primeavg=0;
        int primecount=0;
        int oddcount=0;
        for(int i=0;i<10;i++){
            if(!(i%2==0)){
                oddcount++;
                oddsum+=arr2[i];
            }
        }
        for(int i=0;i<10;i++){
            if(i==2 || i==3 || i==5 || i==7){
                primesum+=arr1[i];
                primecount++;
            }
        }
        primeavg = primesum/primecount;
        oddavg = oddsum/oddcount;
        System.out.println("PrimeSumOfArray 1: "+primesum);
        System.out.println("OddSum of Array 2: "+oddsum);
        System.out.println("Prime Avg: "+primeavg);
        System.out.println("Odd Avg: "+oddavg);
        System.out.println("Product of Prime&Odd: "+(primeavg*oddavg));

    }
}
