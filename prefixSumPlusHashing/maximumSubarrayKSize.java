package prefixSumPlusHashing;
import java.util.*;

public class maximumSubarrayKSize {
    
    public static int maximumSubarrayKSize(int[] nums, int k) {
        int n = nums.length;
        int maxSum = 0, currSum = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        for (int right = 0; right < n; right++) {
            // add right element
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            currSum += nums[right];

            // shrink if window size > k
            if (right - left + 1 > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                currSum -= nums[left];
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }

            // check window validity
            if (right - left + 1 == k && freq.size() == k) {
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println("Maximum distinct subarray sum of size " + k + " = " +
                           maximumSubarrayKSize(nums, k));
    }
}
