class Solution {
    public int maxProduct(int[] nums) {
         int product = 1;
        int maxProduct = nums[0];

        for(int num : nums){
            if(product<0) product = 1;
            product *= num;
            maxProduct = Math.max(product, maxProduct);
        }

        return maxProduct;
        
    }
}
