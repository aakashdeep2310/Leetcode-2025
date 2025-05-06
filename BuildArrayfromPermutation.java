class Solution {
    public int[] buildArray(int[] nums) {
        // int n = nums.length;
        // int ans[] = new int[n];
        // for(int i = 0; i<n; i++){
        //     int num = nums[nums[i]];
        //     ans[i] = num;
        // }
        // return ans;

        // without using extra space
        int n = nums.length;
        for(int i = 0; i<n; i++){
            nums[i] = nums[i] + n * (nums[nums[i]]%n);
        }

        for(int i = 0; i<n; i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}
