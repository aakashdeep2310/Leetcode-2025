class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // so we have to find a divisor, the sum of quotient will be less than or equal to threshold

        int maxi = 0;
        for(int num : nums){
            if(num > maxi) maxi = num;
        }

        int low = 1;
        int high = maxi;
        int ans = 0;
        while( low <= high ){
            int mid = (low + high)/2;
            boolean gotId = func(nums, mid, threshold);

            if(gotId) {
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean func(int[] nums, int divisor, int th){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
           sum += (int) Math.ceil((double) nums[i] / divisor);
        }
        if(sum <= th){
            return true;
        }
        return false;
    }
}
