class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        sum = nums[0];
        for(int i = 1; i<n; i++){
            if(nums[i] > nums[i-1]){  
                sum += nums[i];  
            }else{
                maxSum = Math.max(maxSum, sum);
                sum = nums[i];
            }
        }
        return Math.max(maxSum, sum);
    }
}
