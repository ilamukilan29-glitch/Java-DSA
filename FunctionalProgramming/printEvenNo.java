package FunctionalProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class printEvenNo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13};
        Arrays.stream(arr).filter(i->i%2==0).forEach(i->System.out.print(i+" "));
        int n=5;
        IntStream.rangeClosed(1,n).forEach(i->System.out.print(i+" "));
    }
}

