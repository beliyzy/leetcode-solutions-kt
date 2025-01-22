class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length <= k) {
            return (double) Arrays.stream(nums).sum() / k;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double res = (double) windowSum / k;
        double currAvg;
        for (int i = k; i < nums.length; i++) {
            windowSum -= nums[i - k];
            windowSum += nums[i];

            currAvg = (double) windowSum / k;

            res = Math.max(res, currAvg);
        }

        return res;
    
    }
}