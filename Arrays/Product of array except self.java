// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        int left = 1;
        
        for(int i=0; i<nums.length; i++)
        {
            ans[i] = left;
            left *= nums[i];
        }
        
        int right = 1;
        
        for(int i=nums.length-1; i>=0; i--)
        {
            ans[i] *= right;
            right *= nums[i];
        }
        
        return ans;
    }
}
