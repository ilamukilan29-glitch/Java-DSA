import java.util.Scanner;

public class AttendanceValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int clas, attend;
        clas = sc.nextInt();
        attend= sc.nextInt();
        float attendper=(attend*100)/clas;
        System.out.println(attendper); 
        char medicalCause;
        boolean isAllowed=false;
        if(attendper<75){
            System.out.println("Do you have a medical cause? (Y/N): ");
            medicalCause=sc.next().toLowerCase().charAt(0);
            if(medicalCause=='y'){
                isAllowed=true;
            }
        }
        else{
            isAllowed=true;
        }
        if(isAllowed){
            System.out.println(attendper+"%"+" Allowed");
        }
        else{
            System.out.println(attendper+"%"+" Not Allowed");
        }
    }
}
