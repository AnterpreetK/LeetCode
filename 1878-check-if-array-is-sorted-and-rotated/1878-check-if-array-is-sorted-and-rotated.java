class Solution {
    public boolean check(int[] a) {
        int n = a.length;
        if (n < 2) return true;
        int drops = 0;
        for (int i = 0; i < n; i++)
            if (a[i] > a[(i + 1) % n] && ++drops > 1) return false;
        return true;
    }
}