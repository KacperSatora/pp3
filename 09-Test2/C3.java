public class C3 {
    private String filename;

    public C3(String filename) {
        this.filename = filename;
    }

    public String m1() {
        int pos = filename.indexOf(".");
        return filename.substring(0, pos);
    }

    public String m2() {
        int pos = filename.indexOf(".");
        return filename.substring(pos);
    }

}
