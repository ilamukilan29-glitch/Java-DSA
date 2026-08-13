package Strings;
import java.util.Scanner;
public class CountAlphaNoSpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int alph=0,num=0,spl=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                alph++;
            }else if(Character.isDigit(ch)){
                num++;
            }else if(ch!=' '){
                spl++;
            }
        }
        System.out.println("Number of Alphabet: "+alph);
        System.out.println("Number of Numerics: "+num);
        System.out.println("Number of Special Char: "+spl);
    }
}
