class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int n = nums.length;
        int count = 0;
        
        for(int i = 0; i<n; i++){
            if(nums[i] == goal) count++;
            int sum = nums[i];
            for(int j = i+1; j<n; j++){
                sum += nums[j];
                if(sum == goal){
                    count++;
                }
            }
        }
        return count;
    }
}
