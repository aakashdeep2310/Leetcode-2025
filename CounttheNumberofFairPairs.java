class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }
    private long count(int[] nums, int target){
        long count = 0;
        int left = 0, right = nums.length - 1;
        while(left < right){
            if(nums[right] + nums[left] > target) right--;
            else{
                count += right - left;
                left++;
            }
        }
        return count;
    }
}
