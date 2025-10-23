package SortingAndSearching;

public class FirstBadVersion {
    int fbv = 3;
    boolean isBadVersion(int version) {
        return version >= fbv;
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int m = start + (end - start) / 2 ;
            if (isBadVersion(m)) {
                end = m;
            }
            else {
                start = m + 1;
            }
        }

        return start;
    }
}
