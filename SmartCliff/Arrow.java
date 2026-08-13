package SmartCliff;
import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        int inc = i+(i-1);
        
        
             for(int j=1;j<=inc;j++){
                if(j>=i){
                System.out.print("*");
                 }
                else{
                System.out.print(" ");
                }
        } 
    
    System.out.println();
}
    for(int i=n-1;i>=1;i--){
        int dec = n+3;
        for(int j=1;j<=dec;j++){
            
            if(j<=dec){
                
                 System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           
           
        }
        System.out.println();
    }
        
    }
   
}
