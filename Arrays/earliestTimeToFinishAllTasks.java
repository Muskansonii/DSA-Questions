package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
    

public class earliestTimeToFinishAllTasks {

    public static int findMinimumTime(int[][] tasks) {
        // Sort tasks by end time
        Arrays.sort(tasks, (a, b) -> a[1] - b[1]);
        
        Set<Integer> used = new HashSet<>();
        
        for (int[] task : tasks) {
            int start = task[0], end = task[1], duration = task[2];
            
            // Check how many seconds already covered in this range
            for (int t = start; t <= end; t++) {
                if (used.contains(t)) duration--;
            }
            
            // Assign remaining time from end → start
            for (int t = end; t >= start && duration > 0; t--) {
                if (!used.contains(t)) {
                    used.add(t);
                    duration--;
                }
            }
        }
        return used.size();
    }

    public static void main(String[] args) {    

     int[][] tasks = {
            {2, 6, 2},
            {1, 3, 2},
            {4, 5, 1}
        };
        
        int ans = findMinimumTime(tasks);
        System.out.println("Earliest time to finish all tasks = " + ans);
    }
}


