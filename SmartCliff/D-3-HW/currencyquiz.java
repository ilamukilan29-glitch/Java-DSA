import java.util.Scanner;

public class currencyquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is The unit of Currency of India? ");
        boolean iscrt =false;
        for(int i=0;i<3;i++ ){
            String res = sc.nextLine();
            if(res.equals("Rupee")){
                break;
            }
            else{
                System.out.println("Try Again!");
                
            }
        }
        if(iscrt){
            System.out.println("Correct Answer");
        }
        else{
            System.out.println("Sorry it is Rupee");
        }

    }
}
