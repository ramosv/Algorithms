public class QuickUnionImproved {

    //Quick Union with Weights and path compression

    private int[] id;

    //Set id of each object to itself (N array accesses)
    public QuickUnionImproved(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;

    }

    // chase parent pointers until reach root (depth of i array accesses)
    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    //Check if p and q have same root (depth of p and q array accesses)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    //Check root of p to point to root of q (depth of p and q array accesses)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {

    }
}
