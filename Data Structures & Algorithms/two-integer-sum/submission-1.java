class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prefixMap= new HashMap<>();
    
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(prefixMap.containsKey(diff)){
                return new int[]{prefixMap.get(diff), i};
            }
            prefixMap.put(nums[i], i);
        }
    return new int[]{-1,-1};
    }
}
