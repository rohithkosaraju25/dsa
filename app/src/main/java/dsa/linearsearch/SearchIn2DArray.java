package dsa.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 3 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 > max) {
                    max = element2;
                }
            }
        }
        return max;
    }
}
