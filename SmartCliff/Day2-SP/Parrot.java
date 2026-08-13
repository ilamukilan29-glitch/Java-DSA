import java.util.Scanner;

public class Parrot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        boolean talk = sc.nextBoolean();
        boolean res = ((hr<7||hr>20)&&(talk))?true:false;
        System.out.print(res);
    }
}
