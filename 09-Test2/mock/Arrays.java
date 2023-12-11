public class Arrays {
    static boolean arr(int[] arr1, int[] arr2) {
        int count1 = 0;
        int count2 = 0;
        for (int i : arr1) {
            if (i >= 10 && i <= 99) {
                count1++;
            }
        }

        for (int i : arr2) {
            if (i >= 10 && i <= 99) {
                count2++;
            }
        }

        return count1 == count2;
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5,11};

        System.out.println(Arrays.arr(arr1,arr2));
    }
}
