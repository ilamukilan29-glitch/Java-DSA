package SmartCliff;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        int Salary = sc.nextInt();
        System.out.println("Enter Your Experience: ");
        int Exp = sc.nextInt();
        double Bonus=0;
        if(Exp>=10){
            Bonus=Salary*20/100;
        }
        else if(Exp>=5 && Exp<=9){
            Bonus=Salary*10/100;
        }
        System.out.println("Your Bonus: "+Bonus );

        
    }
}
