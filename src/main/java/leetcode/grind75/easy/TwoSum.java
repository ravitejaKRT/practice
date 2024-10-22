package leetcode.grind75.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//    https://leetcode.com/problems/two-sum
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> requiredAndPrevIndex = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(requiredAndPrevIndex.containsKey(nums[i])){
                return new int[]{i, requiredAndPrevIndex.get(nums[i])};
            }
            requiredAndPrevIndex.put(target-nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

