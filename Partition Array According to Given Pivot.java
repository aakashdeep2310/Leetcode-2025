class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int lCount = 0;
        int pCount = 0;
        int gCount = 0;

        for(int num : nums){
            if(num < pivot){
                lCount++;
            }else if(num == pivot){
                pCount++;
            }else{
                gCount++;
            }
        }

        int i = 0;
        int j = lCount;
        int k = pCount + lCount;
        int n = nums.length;
        int res[] = new int[n];
        int t = 0;
        while(t<n){
            if(nums[t] < pivot){
                res[i] = nums[t];
                i++;
            }else if(nums[t] == pivot){
                res[j] = nums[t];
                j++;
            }else{
                res[k] = nums[t];
                k++;
            }
            t++;
        }
        return res;
    }
}
