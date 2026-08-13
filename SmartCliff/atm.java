package SmartCliff;
import java.util.Scanner;

public class atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Balance = 100000;
        while(Balance>0){
            System.out.println("Enter Withdrawal Amount: ");
            int Withdraw = sc.nextInt();
            if(Withdraw==0){
                System.out.println("Remaining Balance: "+Balance);
                break;
            }
            else if(Balance<Withdraw){
                System.out.println("Balance Not Sufficient!!");
                System.out.println("Your Balance: "+Balance);
            }
            else{
                System.out.println("Withdrawal Succesfull!!");
                Balance-=Withdraw;
                System.out.println("Remaining Balance: "+Balance);
                System.out.println("Enter 0 To Stop Transation!");
            }


        }
    }
}
