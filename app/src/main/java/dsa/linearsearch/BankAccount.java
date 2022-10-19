package dsa.linearsearch;

//check account with highest money and return it
public class BankAccount {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 3 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] arr) {
        // sum of all the elemnts in 2d array
        // Arrays.stream(arr).flatMapToInt(x -> Arrays.stream(x)).reduce((a, b) -> a +
        // b).getAsInt();
        int ans = Integer.MIN_VALUE;
        for (int[] i : arr) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            if (ans < sum)
                ans = sum;
        }
        return ans;
    }
}
