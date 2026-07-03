class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        //int max = 
        for(int i = 0; i<nums.length; i++){
            missing ^= nums[i] ^ i;
        }

        return missing;
    }
}
