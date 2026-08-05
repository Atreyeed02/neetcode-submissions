class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expsum=n*(n+1)/2;
        int acsum=0;
        for(int num:nums){
            acsum+=num;
        }
        return expsum-acsum;
    }
}
