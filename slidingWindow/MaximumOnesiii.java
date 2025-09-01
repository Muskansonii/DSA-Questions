package slidingWindow;

public class MaximumOnesiii {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zerosCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCount++;
            }

            // If zeros exceed k, shrink window from left
            while (zerosCount > k) {
                if (nums[left] == 0) zerosCount--;
                left++;
            }

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
    public static void main(String[] args) {
        MaximumOnesiii outer = new MaximumOnesiii();
        Solution solution = outer.new Solution();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int result = solution.longestOnes(nums, k);
        System.out.println("Longest subarray with at most " + k + " zeros: " + result);
    }
}