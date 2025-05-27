class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       return subArrays(nums, k) - subArrays(nums, k - 1);
    }

    public int subArrays(int nums[], int k){
        int n = nums.length;
        int l = 0;
        int r = 0;
        int count = 0;
        int sum = 0;

        if(k < 0) return 0;

        while(r<n){
           sum += (nums[r] %2);

            while(sum > k){
                sum -= (nums[l]%2);
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
}
