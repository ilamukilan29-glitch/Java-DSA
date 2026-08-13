package Strings;
import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean[] arr = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']=true;
        }
        boolean flag=true;
        for(boolean ar:arr){
            if(!ar){
                flag=false;
                System.out.println("Not a Panagram");
                break;
                
            }
        }
        if(flag)
            System.out.println("Not a Panagram");
    }
}
