import java.util.HashSet;
import java.util.ArrayList;

public class Numbers {
    ArrayList<Integer> params;

    public Numbers(int... params) {
        this.params = new ArrayList<>();
        for (int i : params) {
            this.params.add(i);
        }
    }

    public boolean different() {
        return new HashSet<Integer>(params).size() == 5;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers(1, 2, 3, 4, 5);
        Numbers numbers2 = new Numbers(1, 0, 2, 0, 3);
        System.out.println(numbers.different());
        System.out.println(numbers2.different());
    }

}
