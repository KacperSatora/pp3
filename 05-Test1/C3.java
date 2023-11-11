public class C3 {
    public static boolean isAlphabet(String t) {
        char[] charArray = t.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] < charArray[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static String hideText(String t) {
        return (t.substring(0) + "*".repeat(t.length() - 2) + t.substring(t.length() - 1));
    }

    // public static void main(String[] args) {
    // System.out.println(C3.isAlphabet("abcdeaf"));
    // System.out.println(C3.hideText("ok"));
    // System.out.println(C3.hideText("test"));
    // System.out.println(C3.hideText("John Cena"));
    // }
}
