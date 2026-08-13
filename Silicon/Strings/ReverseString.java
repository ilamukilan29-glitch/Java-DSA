package Strings;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s1 = s.toCharArray();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            char tem = s1[i];
            s1[i]=s1[j];
            s1[j]=tem; 
        }
        for(char ch:s1)
            System.out.print(ch);
    }
}
