package dsa.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = { 23, 11, 19, 8, -1, -10 };
        int target = 19;
        System.out.println(linearSearch(numbers, target));
        System.out.println(linearSearch2(numbers, target));
        System.out.println(linearSearch3(numbers, target));
    }

    // iterate all the values and check for element one by one
    static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }

        return -1;
    }

    // return element it self
    static int linearSearch2(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    // return true or false
    static boolean linearSearch3(int[] array, int target) {
        for (int element : array) {
            if (element == target)
                return true;
        }
        return false;
    }
}
