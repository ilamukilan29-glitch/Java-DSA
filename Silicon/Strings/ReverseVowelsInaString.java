package Strings;
import java.util.Scanner;
public class ReverseVowelsInaString {
    static boolean isVow(char c){
        return(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u'|| c=='A'||c=='E'||c=='I'||c=='U'||c=='O');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int left=0,right=arr.length-1;
        while(left<right){
            if(!isVow(arr[left])&&left<right)
                left++;
            if(!isVow(arr[right])&&left<right)
                right--;
            if(isVow(arr[right])&&isVow(arr[left])){
            char tem =arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
            left++;
            right--;
        }
            
        }
        for(char ar:arr)
            System.out.print(ar);
    }
}
