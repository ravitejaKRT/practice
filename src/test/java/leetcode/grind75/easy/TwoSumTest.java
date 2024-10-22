package leetcode.grind75.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void TestTwoSum() {
        Solution sol = new Solution();

        // Test case 1: Example from the problem statement
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {1, 0};
        assertArrayEquals(expected1, sol.twoSum(nums1, target1));

        // Test case 2: Another example
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {2, 1};
        assertArrayEquals(expected2, sol.twoSum(nums2, target2));

        // Test case 3: No solution
        int[] nums3 = {1, 2, 3};
        int target3 = 7;
        int[] expected3 = {-1, -1};
        assertArrayEquals(expected3, sol.twoSum(nums3, target3));

        // Test case 4: Multiple pairs, should return the first valid pair
        int[] nums4 = {1, 3, 3, 4};
        int target4 = 6;
        int[] expected4 = {2, 1};
        assertArrayEquals(expected4, sol.twoSum(nums4, target4));

        // Test case 5: Single element array, no solution
        int[] nums5 = {1};
        int target5 = 1;
        int[] expected5 = {-1, -1};
        assertArrayEquals(expected5, sol.twoSum(nums5, target5));

        // Test case 6: Empty array, no solution
        int[] nums6 = {};
        int target6 = 0;
        int[] expected6 = {-1, -1};
        assertArrayEquals(expected6, sol.twoSum(nums6, target6));
    }
}
