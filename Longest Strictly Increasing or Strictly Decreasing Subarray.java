class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int inc = 1;
        int dec = 1;
        int res = 1;
        int max = 1;
        for(int i = 1; i<n; i++){
            if(nums[i] > nums[i-1]){
                inc++;
                dec = 1;
                res = Math.max(res, inc);
            }
            else if(nums[i] < nums[i-1]){
                dec++;
                inc = 1;
                res = Math.max(res, dec);
            }else{
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, res);
        }
        return max;
    }
}
