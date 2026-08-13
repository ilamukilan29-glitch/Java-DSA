import java.util.Scanner;
public class AutomophicNo {
     static int pow(int base,int power){
            int res=1;
            if(power==0){
                return 1;
            }else{
                for(int i=1;i<=power;i++){
                    res=res*base;
                }
            }
            return res;
        }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int temp =n;
        while(temp>0){
            temp/=10;
            count++;
        }
        int dub = pow(10,count);
        int ress = n*n;
        
        if(dub)

    }
}
