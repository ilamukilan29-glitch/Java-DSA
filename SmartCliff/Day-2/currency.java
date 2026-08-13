import java.util.Scanner;
public class currency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount: ");
        int a = sc.nextInt();
        int hun = a/100;
        int hurem=a%100;
        int fif = hurem/50;
        int fifrem= hurem%50;
        int ten = fifrem/10;
        int total = hun+fif+ten;

        System.out.println("Denomination 100: "+ hun);
        System.out.println("Denomination 50: "+ fif);
        System.out.println("Denomination 10: "+ ten);
        System.out.println("Total Notes: "+ total);

    

    }
}
