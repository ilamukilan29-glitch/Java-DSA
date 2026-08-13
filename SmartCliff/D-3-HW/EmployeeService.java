import java.util.Scanner;

public class EmployeeService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age and Gender: ");
        int age = sc.nextInt();
        sc.nextLine();
        char gen = sc.nextLine().toLowerCase().charAt(0);
        if((gen!='f'&& gen!='m') || age<=19 || age>=61 ){
            System.out.println("Error");
        }
        else{
             if(gen=='f'){
            System.out.println("Urban Area");
        }
        else{
            if(age>=20 && age<=40){
                System.out.println("AnyWhere");
            }
            else if(age>40 && age<=60){
                System.out.println("Urban Area");
            }

        }
        }
       
    }
}
