class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int totalCount = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int num = nums[i];
            count = 0;
            while(num>0){
                int digit = num%10;
                num = num/10;
                count++;
            }
            if(count % 2 == 0) totalCount++;  
        }
        return totalCount;
    }
}
