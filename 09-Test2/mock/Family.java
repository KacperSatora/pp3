public class Family {
    private Person[] people;

    public Family(Person[] people) {
        this.people = people;
    }

    public int adults() {
        int count = 0;
        for (Person person : people) {
            if (person.getAge() >= 18) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 45),
            new Person("Joanna", 45),
            new Person("Julia", 14)
        };
        Family family = new Family(people);
        System.out.println(family.adults());
    }
}
