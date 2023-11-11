public class C4 {
    static int even(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            };
        }
        return count;
    }

    static int positiveOdd(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 != 0 && i > 0) {
                count++;
            };
        }
        return count;
    }

    // public static void main(String[] args) {
    // int[] arr1 = { 2, -6, 5, 8 };
    // int[] arr2 = { 3, 2, -5, 4, 1, -7 };

    // System.out.println(C4.even(arr1));
    // System.out.println(C4.positiveOdd(arr2));
    // }
}