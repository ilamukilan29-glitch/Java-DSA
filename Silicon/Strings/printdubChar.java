package Strings;
import java.util.Scanner;
public class printdubChar {
    static void printDub(String s){
        boolean[] isVisit = new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            int count=1;
            if(isVisit[i] || s.charAt(i)==' '){
                continue;
            }
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    isVisit[j]=true;
                }
            }//count==1 for printing the unique Char
            //count>1 for printing the Repeated Elements 
            if(count==1){
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printDub(s);
    }
}
