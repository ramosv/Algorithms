import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSumBruteForce {

    //Given N distinct integers, how many triplets sum to exactly zero;

    public static int count(int[] a) {

        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if (a[i] + a[j] + a[k] == 0) {

                        count++;
                    }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = new int[2001];

        for (int i = 0; i < 2000; i++) {

            arr[i] = i * 5;
            arr[i + 1] = i * -5;

        }

        Stopwatch stopwatch = new Stopwatch();
        System.out.println(count(arr));
        double time = stopwatch.elapsedTime();
        System.out.println("Time: " + time);

    }
}
