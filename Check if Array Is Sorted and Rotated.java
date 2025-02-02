class Solution {
    public boolean check(int[] nums) {
    int peek = 0;
    for(int i = 0; i<nums.length; i++){
        if(nums[i] > nums[(i+1) % nums.length]){
            peek++;
        }
    } 
    return (peek<=1)? true:false;
    }
}
