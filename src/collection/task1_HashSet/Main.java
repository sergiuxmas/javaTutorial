package collection.task1_HashSet;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int primitives = 2;
        List<Integer> l = List.of(primitives);
        int[] x = {1,2,3};
        Arrays.stream(x).forEach(System.out::println);
    }
}
