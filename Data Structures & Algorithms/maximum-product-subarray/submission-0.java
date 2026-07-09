class Solution {
    public int maxProduct(int[] nums) {
        int product = nums[0];
        int maxProduct = nums[0];
        for(int i=1; i<nums.length; i++){
            product = Math.max(nums[i], product * nums[i]);
            maxProduct = Math.max(product, maxProduct);
        }

        return maxProduct;
    }
}
