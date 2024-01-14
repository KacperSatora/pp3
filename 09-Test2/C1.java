import java.util.ArrayList;
import java.util.Comparator;

public class C1 {
    public static int m1(int[] array1, int[] array2) {
        int count = 0;
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int m2(int[] array) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int integer : array) {
            ar.add(integer);
        }
        ar.sort(Comparator.reverseOrder());
        return ar.get(1);
    } 
}
