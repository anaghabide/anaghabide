class Solution {
    public boolean hasDuplicate(int[] nums) {
          long size =  Arrays.stream(nums).distinct().count();
          return nums.length != size;
    }
}