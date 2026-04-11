class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(freqMap.containsKey(diff)){
                return new int[]{freqMap.get(diff), i};
            } 
            freqMap.put(num, i);
        }
        return new int[]{-1,-1};
    }
}
