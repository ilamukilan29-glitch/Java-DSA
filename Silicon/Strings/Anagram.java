package Strings;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String t = sc.next().toLowerCase();
        char[] arr1=s.toCharArray();
        char[] arr2=s.toCharArray();
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not a Anagram");
        }
    }
}
