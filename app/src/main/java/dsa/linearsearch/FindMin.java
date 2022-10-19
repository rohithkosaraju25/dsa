package dsa.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class FindMin {
    public static void main(String[] args) {
        int num[] = { 18, 12, -7, 3, 14, 28 };
        System.out.println(min(num));
    }

    static int min(int array[]) {
        List<Integer> aIntegers = new ArrayList<>();
        for (int i : array) {
            aIntegers.add(i);
        }
        int min = aIntegers.stream().reduce((t, u) -> t < u ? t : u).get();
        return min;
    }
}
