package SmartCliff;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        for(int i=0;i<3;i++){
            list2.add(new ArrayList<>());
        }

        for(int j=0;j<3;j++){
            
            for(int i=0;i<3;i++){
                 list2.get(j).add(sc.nextInt());
            }
        }
      
     
        System.out.print(list2);
    }
}
