package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by lilia on 06.07.17.
 */
public class Seq {

    public static int mid(int n){
        return n*n/10 % 1000;
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> n*n/10 % 1000); // your implementation here
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pseudoRandomStream(13).limit(10).toArray()));
    }
}
