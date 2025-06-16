class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDiff = -1;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[j] > nums[i]){
                    int diff = nums[j] - nums[i];
                    maxDiff = Math.max(maxDiff, diff);
                }
            }
        }
        return maxDiff;
    }
}
