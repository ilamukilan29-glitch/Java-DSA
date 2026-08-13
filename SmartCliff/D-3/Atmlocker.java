import java.util.Scanner;

public class Atmlocker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amt;
        System.out.println("Enter The Amount: ");
        amt = sc.nextInt();
        if(amt%500!=0){
            System.out.println("Enter The Amount in Multiple of 500");
        }
        else{
            if(amt>500){
                int notes=amt-500;
                int notes5 = notes/500;
                System.out.println("5 notes of 100 & "+notes5+" notes of 500");
            }
            else{
                System.out.println("5 notes of 100");
            }
        }
    }
}
