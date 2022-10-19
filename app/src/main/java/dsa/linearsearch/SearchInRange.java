package dsa.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = { 18, 12, -7, 3, 14, 28 };
        int target = 3;
        int start = 1;
        int end = 4;
        System.out.println(linearSearch(num, target, start, end));
    }

    static int linearSearch(int[] array, int target, int start, int end) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (array[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
