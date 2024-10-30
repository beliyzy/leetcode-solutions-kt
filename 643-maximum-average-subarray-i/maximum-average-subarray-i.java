class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxAvg = 1.0 * windowSum / k;

        for (int i = k; i < nums.length; i++) {
            windowSum -= nums[i - k];
            windowSum += nums[i];

            maxAvg = Math.max(maxAvg, 1.0 * windowSum / k);
        }

        return maxAvg;
    }
}