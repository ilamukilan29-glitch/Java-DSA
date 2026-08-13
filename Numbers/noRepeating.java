import java.util.Scanner;

public class noRepeating{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sequence of Nums: ");
        int Seq = sc.nextInt();
        System.out.println("Enter the Num to Find The Apperance: ");
        int N = sc.nextInt();
        int count = 0;

        do{
            int temp = Seq%10;
            count += (temp==N)?1:0;
            Seq /= 10;
        }while(Seq>0); 
        System.out.println(N+" Appeared "+ count + " Times.");
    }
}