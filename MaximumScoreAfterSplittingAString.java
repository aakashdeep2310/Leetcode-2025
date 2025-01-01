class Solution {
    public int maxScore(String s) {

        int n = s.length();
        int zeros = 0;
        int ones = 0;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        for(int j = 0; j<n-1; j++){
            if(s.charAt(j) == '0'){
                zeros++;
            }
            if(s.charAt(j) == '1'){
                ones--;
            }
            sum = zeros+ones;
            maxSum = Math.max(maxSum, sum);
        }   
        return maxSum;
    }
}
