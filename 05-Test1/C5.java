public class C5 {
    private int x, y;

    public C5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        return this.y == 0;
    }

    public boolean isY() {
        return this.x == 0;
    }

    @Override
    public String toString() {
        return (String.format("P(%d,%d)", this.x, this.y));
    }

    // public static void main(String[] args) {
    // C5 o = new C5(3,0);
    // System.out.println(o.isX());
    // System.out.println(o.isY());
    // System.out.println(o.toString());
    // }
}
