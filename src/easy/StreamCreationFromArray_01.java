package easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationFromArray_01 {

    public static void main(String[] args) {
        Integer arr[] = {5,2,3,4,8};

        int res= Arrays.stream(arr).findFirst().get();
        System.out.println("First Element: " + res);

        long count = Stream.of(arr).count();
        System.out.println("Count: " + res);

    }
}
