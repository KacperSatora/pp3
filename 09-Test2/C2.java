public class C2 {
    public static boolean m(int[] numbers) {
        int sumPos = 0, sumNeg = 0;
        for (int i : numbers) {
            if (i >= 0) {
                sumPos += i;
            } else {
                sumNeg += i;
            }
        }
        return sumPos > (Math.abs((double) sumNeg));
    }
}
