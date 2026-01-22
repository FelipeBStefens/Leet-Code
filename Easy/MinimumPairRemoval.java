package Easy;

public class MinimumPairRemoval {

    public int minimumPairRemoval(int[] nums) {
        
        return pairRemoval(nums, 0);
    }

    public int pairRemoval(int[] nums, int minimum) {

        if(isSorted(nums)) {
            return minimum;
        }

        int minPair = 0;
        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] + nums[i + 1] < nums[minPair] + nums[minPair + 1]) {
                minPair = i; 
            }
        }

        int[] newNums = new int[nums.length - 1];
        boolean pairVisited = false;

        for (int i = 0; i < newNums.length; i++) {

            if (i == minPair) {
                pairVisited = true;
                newNums[i] = nums[minPair] + nums[minPair + 1];
            }
            else if (pairVisited) {
                newNums[i] = nums[i + 1];
            }
            else {
                newNums[i] = nums[i];
            }
        }

        return pairRemoval(newNums, minimum + 1);
    }

    public boolean isSorted(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }
}