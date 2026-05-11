class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for(int num:nums){
            sum = Math.max(num, sum+num);
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    } 
}
