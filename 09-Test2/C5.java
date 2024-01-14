import java.util.HashSet;

public class C5 {
    String[] words;

    public C5(String[] words) {
        this.words = words;
    }

    public boolean m() {
        HashSet<String> set = new HashSet<>();
        for (String string : words) {
            set.add(string);
        }

        return set.size() != words.length;
    }
}
