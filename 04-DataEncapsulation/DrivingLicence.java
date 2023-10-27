public class DrivingLicence {
    private String name, surname, address, postalCode, city;
    private int licenceNumber;

    public void display() {
        System.out.println(name + " " + surname + address + city + postalCode + licenceNumber);
    }

    public DrivingLicence() {
        name = "Jan";
        surname = "Kowalski";
        address = "Zielona 1";
        postalCode = "32-020";
        city = "Wieliczka";
        licenceNumber = 1234567890;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
