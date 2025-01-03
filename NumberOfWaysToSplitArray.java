class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        int n = nums.length;

        long totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        long leftSum = 0;

       for(int i = 0; i<n-1; i++){
            leftSum = leftSum + nums[i];
            long rightSum = totalSum - leftSum;

            if(leftSum >= rightSum){
                count++;
            }
       }
        return count;
    }
}
