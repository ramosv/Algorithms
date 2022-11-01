/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        // String input = StdIn.readString();
        String answer = "a", other = "";
        Double x = 1.0;
        while (!StdIn.isEmpty()) {
            other = StdIn.readString();
            if (StdRandom.bernoulli(1 / x)) {
                answer = other;
            }
            x++;
        }
        if (answer == "a") {
            StdOut.print(other);
        }
        else {
            StdOut.print(answer);
        }

    }
}
