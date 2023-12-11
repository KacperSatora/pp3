import java.util.Scanner;

public class DrivingLicenceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrivingLicence dl = new DrivingLicence();
        System.out.println(dl.getName());
        dl.setName("jOHN");
        dl.display();
        dl.toString();
        scanner.close();
    }
}
