import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

//Read in number of Objects N from standard input.
//Repeat:
// - read i pear of integers from standard input
// - if they are not yet connected, connect them and print out pair


public class DynamicConnectivity {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (!uf.connected(q, p)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
