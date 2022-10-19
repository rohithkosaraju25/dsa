package dsa.linearsearch;

// number of even number digits in an array
public class EvenDigits {
    public static void main(String[] args) {
        int evenDigits = 0;
        int arr[] = { 23, 1, 2, 4, 66, 889, 4 };
        System.out.println(checkEvenDigitNumber(arr, evenDigits));
        System.out.println(checkEvenDigitNumber2(arr, evenDigits));
        System.out.println(bestWay(arr));
    }

    static int checkEvenDigitNumber(int[] arr, int evenDigits) {
        for (int i : arr) {
            if (digits(i)) {
                evenDigits++;
            }
        }
        return evenDigits;
    }

    static int checkEvenDigitNumber2(int[] arr, int evenDigits) {
        for (int i : arr) {
            if (i < 0) {
                i *= -1;
            }
            if (i == 0) {
                evenDigits += 1;
                continue;
            }
            evenDigits += String.valueOf(i).length() % 2 == 0 ? 1 : 0;
        }
        return evenDigits;
    }

    static int bestWay(int arr[]) {
        int count = 0;
        for (int i : arr) {
            if (checkIfDigitsEven(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean digits(int i) {
        int count = 0;
        if (i < 0) {
            i *= -1;
        }
        if (i == 0) {
            return true;
        }
        while (i > 0) {
            i = i / 10;
            count++;
        }
        return count % 2 == 0;
    }

    static boolean checkIfDigitsEven(int i) {
        if (i < 0) {
            i *= -1;
        }
        return ((int) Math.log10(i) + 1) % 2 == 0;
    }
}
