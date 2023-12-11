import java.util.HashSet;
import java.util.Set;

public class Numbers {
    int par1, par2, par3, par4, par5;

    public Numbers(int par1, int par2, int par3, int par4, int par5) {
        this.par1 = par1;
        this.par2 = par2;
        this.par3 = par3;
        this.par4 = par4;
        this.par5 = par5;
    }

    public boolean different() {
        Set<Integer> a = new HashSet<>() {{
                add(par1);
                add(par2);
                add(par3);
                add(par4);
                add(par5);
        }};
        // System.out.println(String.format("Set size is = %d", a.size()));
        return a.size() == 5;
    }

    // public static void main(String[] args) {
    //     Numbers numbers = new Numbers(1, 2, 3, 4, 5);
    //     Numbers numbers2 = new Numbers(1, 0, 2, 0, 3);
    //     numbers.different();
    //     numbers2.different();
    // }

}
