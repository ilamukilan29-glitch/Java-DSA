package SmartCliff;
import java.util.Scanner;

public class marks{
    public static void main(String args[]){
        System.out.println("Enter The No of Students: ");
        Scanner sc = new Scanner(System.in);
        int Count = sc.nextInt();
        sc.nextLine();

        int[] Marks;
        String[] Names;
        Marks = new int[Count];
        Names = new String[Count];
        int Highest = 0;
        int Lowest = 100;

        for (int i=1;i<=Count;i++){
            System.out.println("Enter the Details of Student - "+i);
            System.out.println("Name: ");
            Names[i-1] = sc.nextLine(); 
            System.out.println("Mark: ");
            Marks[i-1] = sc.nextInt();
            sc.nextLine();
        }

        for(int i=1;i<=Count;i++){
            if(Marks[i-1] > Highest){
                Highest = Marks[i-1];
            }
            if(Marks[i-1]<Lowest){
                Lowest = Marks[i-1];
            }
            System.out.println(Names[i-1] + " : " + Marks[i-1]);
        }
        
        System.out.println("Highest Mark: "+ Highest);
        System.out.println("Lowest Mark:  "+ Lowest);

        sc.close();

    }
}