import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean weekday = sc.nextBoolean();
        boolean Vacation = sc.nextBoolean();
        boolean res = (weekday || Vacation);
        System.out.print(res);
    }
}
