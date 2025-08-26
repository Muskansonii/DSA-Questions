package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be positive!");
                return;
            }

            int[] nums = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int maxSum = maxSubArray(nums);
            System.out.println("Maximum Subarray Sum: " + maxSum);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
