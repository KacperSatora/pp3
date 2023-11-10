public class C2 {
    private int counter = 0;

    public void increase() {
        this.counter++;
    }

    public void increase(int amount) {
        this.counter += amount;
    }

    public void decrease() {
        this.counter--;
    }

    public void decrease(int amount) {
        this.counter -= amount;
    }

    public int value() {
        return this.counter;
    }

}
