public class QuickUnionImproved {

    //Quick Union with Weights and path compression
    //Same as quick-union, but maintain extra array sz[i]
    //to count number of objects in the tree rooted at i

    private int[] id;
    private int[] sz;

    //Set id of each object to itself (N array accesses)
    public QuickUnionImproved(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }

    }

    // chase parent pointers until reach root (depth of i array accesses)
    //add second loop to root() to set the id[]
    //of each examined node to the root.
    private int root(int i) {
        while (i != id[i]) {
            // Make every other node in path point to its grandparent (thereby halving path length).
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    //Check if p and q have same root (depth of p and q array accesses)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }


    //Check root of p to point to root of q (depth of p and q array accesses)

    //Link root of smaller tree to root of larger tree.
    //Update the sz[] array
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {

            id[i] = j;
            sz[j] += sz[i];
        } else {

            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public static void main(String[] args) {

    }
}
