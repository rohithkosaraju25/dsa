package dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -19, -4, -3, 0, 2, 3, 4, 5, 6, 7, 9 };
        System.out.println(binarysearch(arr, -19));
        System.out.println(binarysearch(arr, 18));
        System.out.println(binarysearch(arr, -19));
    }

    // return index if exist,else -1
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find mid element
            /*
             * int mid = (start + end) / 2; // might be possible that (start + end) exceeds
             * range of int
             */
            System.out.println(start + "----" + end);
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
            System.out.println(start + "--------" + end);
        }
        return -1;
    }
}
