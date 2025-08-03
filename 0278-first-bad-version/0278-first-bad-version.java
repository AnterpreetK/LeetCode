public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2; // prevents overflow
            if (isBadVersion(mid)) {
                right = mid; // mid might be the first bad version
            } else {
                left = mid + 1;
            }
        }
        return left; // left == right and it is the first bad version
    }
}
