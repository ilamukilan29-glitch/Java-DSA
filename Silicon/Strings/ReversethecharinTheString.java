package Strings;
import java.util.Scanner;
public class ReversethecharinTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(reverseachword(str));
        System.out.println(reverseword(str));
    }
    static String reverseachword(String str){
        String res="";
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){

        }
        return res;
    }
    static String reverseword(String str){
        String res="";
        String[] arr = str.split(" ");
        int left=0,right=arr.length-1;
        while(left<right){
            String tem = arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
            left++;
            right--;
        }
        for(String ar:arr){
            for(int i=0;i<ar.length();i++){
                res+=ar;
            }
            res+=" ";
        }
        return res;

    }
}
