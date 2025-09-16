package Arrays;

public class minimumTimeToFinishOneTask {

    /**
     * @param tasks
     * @return
     */
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            int start = task[0];
            int duration = task[1];
            min = Math.min(min, start + duration);
        }
        return min;
    }

    public static void main(String[] args) {
        minimumTimeToFinishOneTask sol = new minimumTimeToFinishOneTask();

        // Example 1
        int[][] tasks1 = {{1, 6}, {2, 3}};
        System.out.println("Earliest finish time (Example 1): " + sol.earliestTime(tasks1)); // Output: 5

        // Example 2
        int[][] tasks2 = {{100, 100}, {100, 100}, {100, 100}};
        System.out.println("Earliest finish time (Example 2): " + sol.earliestTime(tasks2)); // Output: 200

        // You can add more test cases here if you want!
    }
}