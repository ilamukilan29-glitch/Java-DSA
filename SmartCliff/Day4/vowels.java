package SmartCliff.Day4;
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char v = sc.nextLine().charAt(0);
        if(v=='a'||v=='A'||v=='e'||v=='E'|| v=='i'|| v=='I'||v=='o'||v=='O'||v=='u'||v=='U'){
            System.out.println("Vowel");
        }
        else if((v>='A' &&'Z'>=v) || (v>='a' && v<='z')){
            System.out.println("Consonant");
        }
        else{
            System.out.println("Invalid Character");
        }
    }
}
