package Strings;
import java.util.Scanner;
public class LargestWordInaString {
    static void Longestword(String s){
        int count=0;
        int max=0;
        int index=-1;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch!=' ')
                count++;
                
          
        }
        System.out.println(max);
        for(int i=index+1;i<index+max+1;i++)
            System.out.print(s.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        Longestword(s);
    }
}
