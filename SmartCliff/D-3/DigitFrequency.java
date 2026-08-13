import java.util.HashMap;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int tem = n%10;
            if(map.containsKey(tem)){
                map.put(tem,map.get(tem)+1);
            }
            else{
                map.put(tem,1);
            }
            n/=10;

        }
        for(int key : map.keySet()){
            System.out.println(key +" occurs "+ map.get(key)+" times");
        }
    }
}
