class Solution {
    public int lengthOfLIS(int[] nums) {
        int sum = 0;
        for(int num: nums){
            int left = 0;
            int right = sum;
            int current = num;
            while(left < right){
                int mid = left + (right-left)/2;

                if(nums[mid] < current){
                    left = mid + 1;
                } else{
                    right = mid;
                }
            }

            nums[left] = current;
            if(left == sum){
                sum++;
            }

        }

        return sum;
    }
}
