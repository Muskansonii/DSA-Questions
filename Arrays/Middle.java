 package Arrays; // MUST match folder name

public class Middle {
    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};

        int total = 0;
        for (int n : nums) total += n;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                System.out.println("Middle index: " + i);
                return;
            }
            leftSum += nums[i];
        }

        System.out.println("-1");
    }
}


