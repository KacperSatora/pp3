public class DrivingLicence {
    private String name, surname, address, postalCode, city;
    private int licenceNumber, yoi;

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
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public String getName() {
        return this.name;
    }

    public void setYoi(int yoi) {
        if (yoi > 1980) {
            this.yoi = yoi;
        }
    }

    public String toString() {
        return getName();
    }
}

