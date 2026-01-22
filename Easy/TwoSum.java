package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSums(int[] nums, int target) {

        Map<Integer, Integer> values = new HashMap<>();
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (values.containsKey(target - nums[i])) {
                
                solution[0] = i;
                solution[1] = values.get(target - nums[i]); 
                break;
            }

            values.put(nums[i], i);
        }

        return solution;
    }
}