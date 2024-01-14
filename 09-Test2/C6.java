import java.util.ArrayList;

public class C6 {
    ArrayList<Person> peopple = new ArrayList<>();
    public void m1(Person p) {
        peopple.add(p);
    }
    public int m2() {
        int count = 0;
        for (Person person : peopple) {
            if (person.getAge() >= 18) {
                count++;    
            }
        }
        return count;
    }
}
