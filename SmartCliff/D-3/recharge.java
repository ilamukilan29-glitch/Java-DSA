import java.util.Scanner;
public class recharge{
    static void postpaid(int amt,String net){
        double surcharge =200;
        double discount =0;
        if(net.equalsIgnoreCase("Airtel")){
             discount = amt*8/100;
        }
        else if(net.equalsIgnoreCase("Jio")){
            discount = amt*10/100;
        }
        else if(net.equalsIgnoreCase("VI")){
             discount = amt*5/10;
        }
        else{
             discount =amt*3/100;
        }
        double total = (amt-discount)+surcharge;
        System.out.println("Provider Discount Applied: "+discount);
        System.out.println("Surcharge Applied: "+surcharge);
        System.out.println("Final Recharge Amount: "+total);
        if(total<=299){
            System.out.println("Economy Plan: Well within budget");
        }
        else if(total>299 && total<1000){
            System.out.println("Standard Plan: within Budget");
        }
        else if(total>1000 && total<=15000 ){
            System.out.println("Premium Plan: Affordable but on the higher side");
        }
        else{
            System.out.println("Ultra Premium Plan: Beyond budget");
        }
    }
     static void prepaid(int amt,String net){
        double surcharge =0;
        double discount =0;
        if(net.equalsIgnoreCase("Airtel")){
             discount = amt*8/100;
        }
        else if(net.equalsIgnoreCase("Jio")){
            discount = amt*10/100;
        }
        else if(net.equalsIgnoreCase("VI")){
             discount = amt*5/10;
        }
        else{
             discount =amt*3/100;
        }
        double total = (amt-discount)+surcharge;
        System.out.println("Provider Discount Applied: "+discount);
        System.out.println("Surcharge Applied: "+surcharge);
        System.out.println("Final Recharge Amount: "+total);
        if(total<=299){
            System.out.println("Economy Plan: Well within budget");
        }
        else if(total>299 && total<1000){
            System.out.println("Standard Plan: within Budget");
        }
        else if(total>1000 && total<=15000 ){
            System.out.println("Premium Plan: Affordable but on the higher side");
        }
        else{
            System.out.println("Ultra Premium Plan: Beyon budget");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Network Provider: ");
        String net= sc.nextLine();
        System.out.println("Enter Your Plan Type: ");
        String type = sc.nextLine();
        System.out.println("Enter Your Recharge Amount: ");
        int amt = sc.nextInt();
          if(type.equalsIgnoreCase("Postpaid")){
             postpaid(amt,net);
        }
        if(type.equalsIgnoreCase("prepaid")){
             prepaid(amt,net);
        }
      
    }
}