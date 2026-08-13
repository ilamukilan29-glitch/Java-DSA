import java.util.Scanner;

public class FrequencyOfElementsInArr {
    /*
        It's The Bruteforce approch to find the frequencty of elements in array,
        Using an Boolean Array Approach.

    */
   static void freq(int[] arr,int n){
    //Creating a boolean array for checking the Checking the Repeatations
        boolean[] isrep = new boolean[n];
        for(int i=0;i<n;i++)
            isrep[i]=true;


        for(int i=0;i<n;i++){
            int count=1;
            //checking is this elements is Repeated Or Not, if Repeated use(continue;)
            if(isrep[i]==false){
               continue; 
            }
            //if Not Repeated count the occurance
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    isrep[j]=false;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        freq(arr,n);
    }
}
