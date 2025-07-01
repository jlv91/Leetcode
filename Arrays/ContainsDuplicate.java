package Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    // could we sort nums before?
    public static boolean containsDuplicate(int[] nums) {
        var seen = new HashSet<>();
        for (int num : nums) {
            if (seen.add(num) == false) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println("Array contains duplicates: " + hasDuplicates);
    }
}
