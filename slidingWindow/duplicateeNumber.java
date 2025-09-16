package slidingWindow;

public class duplicateeNumber {
    
    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        
        // Step 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Step 2: Find duplicate
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};  
        System.out.println("Duplicate Number is: " + findDuplicate(nums));
    }
}
