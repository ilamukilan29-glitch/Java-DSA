package NewJava;
import java.util.Scanner;

public class CategorizeBoxAccording {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length= ");
        int length = sc.nextInt();
        System.out.println("Width= ");
        int width = sc.nextInt();
        System.out.println("Height= ");
        int height = sc.nextInt();
        System.out.println("Mass= ");
        int mass = sc.nextInt();
        boolean bulky =(length>=10000|| width>=10000 || height>=10000 || mass>=10000)?true:false;
       
         if(mass>=100 &&(bulky)){
            System.out.println("Both");
        }
        else if(bulky){
            System.out.println("Bulky");
        }
        else if(mass>=100){
            System.out.println("Heavy");
        }else{
            System.out.println("Neither");
        }

    }
}
