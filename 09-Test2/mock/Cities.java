import java.util.ArrayList;

public class Cities {
    private String[] names;

    public Cities(String[] names) {
        this.names = names;
    }

    public Cities filter(char start) {
        ArrayList<String> filtered = new ArrayList<>();
        for (String name : names) {
            if (name.charAt(0) == start) {
                filtered.add(name);
            }
        }
        return new Cities(filtered.toArray(new String[filtered.size()]));
    }

    public String cities() {
        return String.join(",", names);
    }

    public static void main(String[] args) {
        Cities cities = new Cities(new String[] { "szczecin", "poznan", "krakow", "warszawa", "solnechny" });
        System.out.println(cities.cities());
        Cities filtered = cities.filter('s');
        System.out.println(filtered.cities());
    }
}
