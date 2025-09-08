package SortingAndSearching;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // copy m  elemnt from first array
        int[] nums_1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums_1[i] = nums1[i];
        }

        int i1 = 0;
        int i2 = 0;
        int i = 0;
        while (i1 < m && i2 < n) {
            if (nums2[i2] < nums_1[i1]) {
                nums1[i] = nums2[i2];
                i2++;
            }
            else {
                nums1[i] = nums_1[i1];
                i1++;
            }
            i++;
        }

        // copy rest
        while (i1 < m) {
            nums1[i] = nums_1[i1];
            i1++;
            i++;
        }
        while (i2 < n) {
            nums1[i] = nums2[i2];
            i2++;
            i++;
        }

    }

    public static void main(String[] args) {
        System.out.println();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);

        for (int i = 0; i < 6; i++)
            System.out.println(nums1[i]);
    }
}
