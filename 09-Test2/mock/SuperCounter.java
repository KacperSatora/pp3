public class SuperCounter extends Counter {

    SuperCounter(int c) {
        super(c);
    }

    public void addN(int n) {
        for (int i = 0; i < n; i++) {
            super.add1();
        }
    }
}
