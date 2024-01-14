public class C7 extends Vehicle{
    private int speed;
    C7(int seats, int speed) {
        super(seats);
        this.speed = speed;
    }
    public int[] spec() {
        return new int[] {getSeats(), speed};
    }
    
}
