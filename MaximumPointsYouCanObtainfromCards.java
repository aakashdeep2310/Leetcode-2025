class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int size = n - k;
        int j = 0;
        int sum = 0;
        int total = 0;
        for(int t : cardPoints){
            total += t;
        }
        while(j < size){
            sum += cardPoints[j++];
        }
        
        int ans = sum;
        j = 0;
        for(int i = size; i<n; i++){
            sum -= cardPoints[j++];
            sum += cardPoints[i];
            ans = Math.min(ans, sum);
        }
        return total - ans;
    }
}
