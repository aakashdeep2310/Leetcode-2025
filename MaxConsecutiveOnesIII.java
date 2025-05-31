class Solution {
    public int longestOnes(int[] nums, int k) {
        // int ans = 0;
        int zeros = 1;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else if(nums[i] == 0){
                zeros++;
                if(zeros <= k){
                    count++;
                }
            }
            if(zeros > k){
                count = 0;
                zeros = 0;
            }
        }
        return count;
    }
}
