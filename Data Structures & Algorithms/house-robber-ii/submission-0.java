class Solution {
    public int rob(int[] nums) {
      return Math.max(helper(nums, 0, nums.length-2),
                    helper(nums, 1, nums.length-1));
    }

    public int helper(int nums[], int start, int end){
        int prev1=0;
        int prev2=0;
        for(int i=start; i<=end; i++){
            int curr = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
