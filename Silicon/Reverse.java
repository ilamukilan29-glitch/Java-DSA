public class Reverse {
    public static void main(String[] args) {
        String s = "Hello";
        int j=s.length()-1;
        for(int i=j;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
