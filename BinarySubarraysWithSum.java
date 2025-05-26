class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        // int n = nums.length;
        // int count = 0;
        
        // for(int i = 0; i<n; i++){
        //     if(nums[i] == goal) count++;
        //     int sum = nums[i];
        //     for(int j = i+1; j<n; j++){
        //         sum += nums[j];
        //         if(sum == goal){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        return subArray(nums, goal) - subArray(nums, goal -1);
    }

    public int subArray(int[] nums, int goal){
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;

        if(goal < 0) return 0;

        while(r < n){
            sum += nums[r];

            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}
