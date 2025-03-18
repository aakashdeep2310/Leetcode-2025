class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int start = 0;
        int bitMask = 0;
        int maxLen = 0;
        for(int end = 0; end < n; end++){
            while((bitMask & nums[end]) != 0){
                bitMask = bitMask ^ nums[start];
                start++;
            }
            bitMask = bitMask | nums[end];
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
