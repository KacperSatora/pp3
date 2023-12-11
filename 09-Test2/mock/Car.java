import java.util.Arrays;

public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        return new int[] { getSeats(), maxSpeed };
    }

    public static void main(String[] args) {
        Car car = new Car(4, 160);
        System.out.println(Arrays.toString(car.spec()));
    }

}
