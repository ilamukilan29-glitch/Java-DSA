import java.util.Scanner;


public class CustomerOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stocks, order, credit: ");
        int stocks=sc.nextInt();
        int order = sc.nextInt();
        sc.nextLine();
        char credit = sc.nextLine().toLowerCase().charAt(0);
        if(credit =='n'){
            System.out.println("Cannot Supply");
        }
        else{
            if(stocks<order){
                System.out.println(stocks +" supplied. Out of stock. Balance Will be Refunded");
            }
            else{
                System.out.println(order +" supplied");
            }
        }
    }
}
