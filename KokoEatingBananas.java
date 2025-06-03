class Solution {
    public int minEatingSpeed(int[] piles, int h) {

    //     //Brute force  // TLE
    //     int reqTime = 0;
    //     int max = 0;
    //     for (int val : piles) {
    //         max = Math.max(max, val);
    //     }

    //     for(int i = 1; i<=max; i++){
    //         reqTime = func(piles, i);
    //         if(reqTime <= h){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public int func(int[] piles, int hourly){
    //     int totalHrs = 0;

    //     for(int i = 0; i<piles.length; i++){
    //         totalHrs += (int) Math.ceil((double)piles[i] / hourly);
    //     }
    //     return totalHrs;


    // Optimal Approach Using Binary Search

        int n = piles.length;
        int reqTime = 0;
        int max = 0;
        
        for (int val : piles) {
            max = Math.max(max, val);
        }

        int low = 1;
        int high = max;
        int ans = max;
       while(low <= high){
            int mid = (low+high)/2;
            
            reqTime = func(piles, mid);
            if(reqTime <= h){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int func(int[] piles, int hourly){
        int totalHrs = 0;

        for(int i = 0; i<piles.length; i++){
           totalHrs += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return totalHrs;

    }
}
