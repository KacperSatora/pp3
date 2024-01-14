import java.util.Arrays;

public class C4 {
    int[] grades;
    int score = 0;

    public C4(int[] grades) {
        this.grades = grades;
        Arrays.sort(grades);
    }

    public int m() {
        int score = 0;
        for (int i = 1; i < grades.length - 1; i++) {
            score += grades[i];
        }
        return score;
    }

    

}
