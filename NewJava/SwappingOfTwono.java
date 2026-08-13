package NewJava;

public class SwappingOfTwono {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=b^a;
        b=a^b;
        a=a^b;

        System.out.println(a+" "+b);
    }
}
