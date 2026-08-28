package KunalKushwaha.Recursion;

public class SkipCharInString {
    static String skipa(String s,String res){
        if(s.isEmpty()){
            return res;
        }
        if(s.charAt(0)=='a'){
            return skipa(s.substring(1), res);
        }
        return skipa(s.substring(1), res+s.charAt(0));
    }
    static String skipword(String s, String res){
        if(s.isEmpty()){
            return res;
        }
        if(s.startsWith("apple")){
            return skipword(s.substring(5), res);
        }
        return skipword(s.substring(1), res+s.charAt(0));
    }
    public static void main(String[] args) {
        String s ="Ilamukilan";
        System.out.println(skipa(s,""));
        System.out.println(skipword("appletom appleeatsapple fish", ""));
    }
}
