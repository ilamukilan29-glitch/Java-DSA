package Strings;
import java.util.Scanner;
public class InsertStringAtParticularIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = sc.next();
        int index = sc.nextInt();
        String res="";
        for(int i=0;i<index;i++){
            res+=s.charAt(i);
        }
        for(int i=0;i<word.length();i++)
            res+=word.charAt(i);
        for(int i=index;i<s.length();i++)
            res+=s.charAt(i);
        System.out.println(res);
    }
}
