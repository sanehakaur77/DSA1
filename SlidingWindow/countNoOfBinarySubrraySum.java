class Solution {

    // Main function:
    // Exact sum = atMost(goal) - atMost(goal - 1)
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    // This function counts subarrays whose sum is AT MOST 'goal'
    private int atMost(int[] nums, int goal) {

        // If goal becomes negative, no valid subarray possible
        if (goal < 0) return 0;

        int left = 0;   // Left pointer of sliding window
        int sum = 0;    // Current window sum
        int count = 0;  // Total number of valid subarrays

        // Right pointer moves through the array
        for (int right = 0; right < nums.length; right++) {

            // Add current element to window sum
            sum += nums[right];

            // If sum becomes greater than goal,
            // shrink window from left
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            // All subarrays ending at 'right'
            // and starting from 'left' to 'right' are valid
            // Number of such subarrays = (right - left + 1)
            count += (right - left + 1);
        }

        // Return total subarrays with sum <= goal
        return count;
    }
}
