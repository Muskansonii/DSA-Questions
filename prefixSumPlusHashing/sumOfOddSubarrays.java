package prefixSumPlusHashing;
public class sumOfOddSubarrays {
    public static int sumOfOddSubarrays(int[] arr) {
        int totalSum = 0;
        int currentSum = 0;
        int oddCount = 0;
        int evenCount = 1; // Start with one even prefix sum (sum = 0)

        for (int num : arr) {
            currentSum += num; // Update the current prefix sum
            
            // Check if the current prefix sum is odd or even
            if (currentSum % 2 != 0) {
                // If current sum is odd, all even prefix sums before it can form odd sum subarrays
                totalSum += oddCount; // Add the count of odd prefix sums
                oddCount++; // Increment the count of odd prefix sums
            } else {
                // If current sum is even, all odd prefix sums before it can form odd sum subarrays
                totalSum += evenCount; // Add the count of even prefix sums
                evenCount++; // Increment the count of even prefix sums
            }
        }
        
        return totalSum; // Return the total sum of odd subarrays
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Example array
        int result = sumOfOddSubarrays(arr);
        System.out.println("Sum of subarrays with odd sum: " + result);
    }
}
