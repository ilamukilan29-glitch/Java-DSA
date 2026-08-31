import java.util.ArrayList;

public class NumberKeyPermutation {
    // 17. Letter Combinations of a Phone Number
    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

    static ArrayList<String> res(String up, String p){
        
        if(up.isEmpty()){
            ArrayList<String> val = new ArrayList<>();
            val.add(p);
            return val;
        }

        String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<arr[up.charAt(0)].length();i++){
            list.addAll(res(arr[up.charAt(0)].substring(i),up.substring(1)));
        }
    }
    public static void main(String[] args) {
        
    }
}
