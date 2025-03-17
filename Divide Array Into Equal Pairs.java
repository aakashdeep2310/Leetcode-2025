class Solution {
    public boolean divideArray(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        boolean flag = true;
        for(int i = 0; i<n; i++){
            if(nums[i] != nums[i+1]){
               return false;
            }else{
                i++;
            }
        }
        return flag;
    }
}
